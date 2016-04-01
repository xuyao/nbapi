package cn.nb.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author xuyao
 * 
 */

public class ImageUtil {

		/***
		 * @param srcImgPath 原图片路径
		 * @param distImgPath  转换大小后图片路径
		 * @param width   转换后图片宽度
		 * @param height  转换后图片高度
		 */
		public static void resizeImage(String srcImgPath, String distImgPath,
				int width, int height, String picType) throws IOException {

			File srcFile = new File(srcImgPath);
			Image srcImg = ImageIO.read(srcFile);
			BufferedImage buffImg = null;
			buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			buffImg.getGraphics().drawImage(srcImg.
					getScaledInstance(width, height, Image.SCALE_SMOOTH), 0,0, null);

			ImageIO.write(buffImg, picType, new File(distImgPath));

		}

		
		public static void main(String []args){
			try {
				resizeImage("e:\\a.jpg","e:\\b.jpg",160,160,"JPEG");
			} catch (IOException e) {
				System.out.println("图片转换出现异常！");
			}
			
		}

}
