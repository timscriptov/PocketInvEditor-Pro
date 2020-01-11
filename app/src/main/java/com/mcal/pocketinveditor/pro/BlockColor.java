package com.mcal.pocketinveditor.pro;

import com.mcal.pocketinveditor.geo.ChunkManager;
import com.mcal.pocketinveditor.io.leveldb.DBKey;
import com.mcal.pocketinveditor.material.MaterialKey;
import java.util.HashMap;
import java.util.Map;

public class BlockColor {
    public static final Map<MaterialKey, Integer> colors = new HashMap<>();
    private static final MaterialKey tempKey = new MaterialKey((short) 0, (short) 0);
	public static final int SLEEP_INTERVAL = 120;
    static {
        add(0, 0, 201, 119, 240);
        add(1, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(2, 0, 117, 176, 73);
        add(3, 0, 134, 96, 67);
        add(4, 0, 115, 115, 115);
        add(5, 0, 157, ChunkManager.WORLD_HEIGHT, 79);
        add(6, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(6, 1, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(6, 2, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(7, 0, 84, 84, 84);
        add(8, 0, 38, 92, 255);
        add(9, 0, 38, 92, 255);
        add(10, 0, 255, 90, 0);
        add(11, 0, 255, 90, 0);
        add(12, 0, 218, 210, 158);
        add(13, 0, 136, 126, 126);
        add(14, 0, 143, 140, 125);
        add(15, 0, 136, 130, 127);
        add(16, 0, 115, 115, 115);
        add(17, 0, 102, 81, 51);
        add(17, 1, 102, 81, 51);
        add(17, 2, 102, 81, 51);
        add(18, 0, 60, 192, 41);
        add(18, 1, 74, 131, 66);
        add(18, 2, 89, 151, 76);
        add(18, 3, 74, 131, 66);
        add(18, 4, 60, 192, 41);
        add(18, 5, 74, 131, 66);
        add(18, 6, 89, 151, 76);
        add(18, 7, 74, 131, 66);
        add(18, 8, 60, 192, 41);
        add(18, 9, 74, 131, 66);
        add(18, 10, 89, 151, 76);
        add(18, 11, 74, 131, 66);
        add(19, 0, 193, 193, 57);
        add(20, 0, 255, 255, 255);
        add(21, 0, 27, 70, 161);
        add(22, 0, 0, 0, 0);
        add(23, 0, 96, 96, 96);
        add(24, 0, 218, 210, 158);
        add(25, 0, 114, 88, 56);
        add(26, 0, 255, 0, 0);
        add(27, 0, SLEEP_INTERVAL, 53, 28);
        add(28, 0, 200, 189, 189);
        add(29, 0, 132, 132, 132);
        add(30, 0, 255, 255, 255);
        add(31, 0, 104, 156, 53);
        add(31, 1, 104, 156, 53);
        add(31, 2, 104, 156, 53);
        add(32, 0, 148, 100, 40);
        add(33, 0, 132, 132, 132);
        add(34, 0, 119, 92, 53);
        add(35, 0, 222, 222, 222);
        add(35, 1, 234, 127, 55);
        add(35, 2, 191, 75, 201);
        add(35, 3, 104, 139, 212);
        add(35, 4, 104, 139, 212);
        add(35, 5, 59, 189, 48);
        add(35, 6, 217, 131, 155);
        add(35, 7, 66, 66, 66);
        add(35, 8, 166, 166, 166);
        add(35, 9, 39, 117, 149);
        add(35, 10, 129, 54, 196);
        add(35, 11, 39, 51, 161);
        add(35, 12, 86, 51, 28);
        add(35, 13, 56, 77, 24);
        add(35, 14, 164, 45, 41);
        add(35, 15, 0, 0, 0);
        add(37, 0, 255, 255, 0);
        add(38, 0, 255, 0, 0);
        add(39, 0, 145, 109, 85);
        add(40, 0, 226, 18, 18);
        add(41, 0, 231, 165, 45);
        add(42, 0, 191, 191, 191);
        add(43, 0, 200, 200, 200);
        add(43, 1, 200, 200, 200);
        add(43, 2, 200, 200, 200);
        add(43, 3, 200, 200, 200);
        add(43, 4, 200, 200, 200);
        add(43, 5, 200, 200, 200);
        add(44, 0, 200, 200, 200);
        add(44, 1, 200, 200, 200);
        add(44, 2, 200, 200, 200);
        add(44, 3, 200, 200, 200);
        add(44, 4, 200, 200, 200);
        add(44, 5, 200, 200, 200);
        add(45, 0, 170, 86, 62);
        add(46, 0, 160, 83, 65);
        add(47, 0, 188, 152, 98);
        add(48, 0, 115, 169, 115);
        add(49, 0, 26, 11, 43);
        add(50, 0, 245, 220, 50);
        add(51, 0, 255, 170, 30);
        add(52, 0, 25, 82, 122);
        add(53, 0, 157, ChunkManager.WORLD_HEIGHT, 79);
        add(54, 0, 125, 91, 38);
        add(55, 0, 245, 50, 50);
        add(56, 0, 129, 140, 143);
        add(57, 0, 45, 166, 152);
        add(58, 0, 114, 88, 56);
        add(59, 0, 146, 192, 0);
        add(59, 1, 146, 192, 0);
        add(59, 2, 146, 192, 0);
        add(59, 3, 146, 192, 0);
        add(59, 4, 146, 192, 0);
        add(59, 5, 146, 192, 0);
        add(59, 6, 146, 192, 0);
        add(59, 7, 146, 192, 0);
        add(60, 0, 95, 58, 30);
        add(61, 0, 96, 96, 96);
        add(62, 0, 96, 96, 96);
        add(63, 0, 111, 91, 54);
        add(64, 0, 136, 109, 67);
        add(65, 0, 181, 140, 64);
        add(66, 0, 150, 134, 102);
        add(67, 0, 115, 115, 115);
        add(68, 0, 111, 91, 54);
        add(69, 0, 124, 98, 62);
        add(70, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(71, 0, 191, 191, 191);
        add(72, 0, 157, ChunkManager.WORLD_HEIGHT, 79);
        add(73, 0, 131, 107, 107);
        add(74, 0, 131, 107, 107);
        add(75, 0, 181, 140, 64);
        add(76, 0, 255, 0, 0);
        add(77, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(78, 0, 255, 255, 255);
        add(79, 0, 83, 113, 163);
        add(80, 0, 250, 250, 250);
        add(81, 0, 25, SLEEP_INTERVAL, 25);
        add(82, 0, 151, 157, 169);
        add(83, 0, 100, 67, 50);
        add(84, 0, 114, 88, 56);
        add(85, 0, 157, ChunkManager.WORLD_HEIGHT, 79);
        add(86, 0, 227, 144, 29);
        add(87, 0, 104, 8, 8);
        add(88, 0, 106, 82, 68);
        add(89, 0, 249, 212, 156);
        add(90, 0, 214, 127, 255);
        add(91, 0, 249, 255, 58);
        add(92, 0, 234, 233, 235);
        add(93, 0, 245, 50, 50);
        add(94, 0, 245, 50, 50);
        add(96, 0, 143, 107, 53);
        add(97, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(97, 1, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(97, 2, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(98, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(98, 1, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(98, 2, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(99, 0, 145, 109, 85);
        add(100, 0, 181, 29, 27);
        add(101, 0, 77, 77, 78);
        add(102, 0, 255, 255, 255);
        add(103, 0, 190, 184, 41);
        add(104, 0, 227, 144, 29);
        add(105, 0, 190, 184, 41);
        add(106, 0, 117, 176, 73);
        add(107, 0, 157, ChunkManager.WORLD_HEIGHT, 79);
        add(108, 0, 170, 86, 62);
        add(109, 0, SLEEP_INTERVAL, SLEEP_INTERVAL, SLEEP_INTERVAL);
        add(110, 0, 140, 115, 119);
        add(111, 0, 117, 176, 73);
        add(112, 0, 54, 24, 30);
        add(113, 0, 54, 24, 30);
        add(114, 0, 54, 24, 30);
        add(115, 0, 112, 8, 28);
        add(116, 0, 88, 23, 22);
        add(117, 0, 189, 163, 82);
        add(DBKey.PLACEHOLDER, 0, 79, 79, 79);
        add(119, 0, 0, 0, 0);
        add(SLEEP_INTERVAL, 0, 55, 142, 215);
        add(121, 0, 235, 248, 182);
        add(99, 1, 145, 109, 85);
        add(99, 2, 145, 109, 85);
        add(99, 3, 145, 109, 85);
        add(99, 4, 145, 109, 85);
        add(99, 5, 145, 109, 85);
        add(99, 6, 145, 109, 85);
        add(99, 7, 145, 109, 85);
        add(99, 8, 145, 109, 85);
        add(99, 9, 145, 109, 85);
        add(99, 10, 145, 109, 85);
        add(100, 1, 181, 29, 27);
        add(100, 2, 181, 29, 27);
        add(100, 3, 181, 29, 27);
        add(100, 4, 181, 29, 27);
        add(100, 5, 181, 29, 27);
        add(100, 6, 181, 29, 27);
        add(100, 7, 181, 29, 27);
        add(100, 8, 181, 29, 27);
        add(100, 9, 181, 29, 27);
        add(100, 10, 181, 29, 27);
    }

    public static void add(int id, int damage, int r, int g, int b) {
        colors.put(new MaterialKey((short) id, (short) damage), Integer.valueOf(((r << 16) | (g << 8)) | b));
    }

    public static int get(int id, int damage) {
        tempKey.typeId = (short) id;
        tempKey.damage = (short) damage;
        Integer retval = colors.get(tempKey);
        if (retval == null) {
            tempKey.damage = (short) 0;
            retval = colors.get(tempKey);
            if (retval == null) {
                return 16777215;
            }
        }
        return retval.intValue();
    }
}
