package caiDatThuatToanTimKiemNhiPhanSuDungDeQuy;

import java.util.Arrays;

public class binarySearch {
    public static int binarySearch(int[] array, int left, int right, int value){
        if(left > right){
            return -1;
        }
        int mid = (right + left) / 2;
        if(array[mid] == value){
            return mid;
        } else if (value > array[mid]){
            return binarySearch(array, mid + 1, right, value);
        } else {
            return binarySearch(array,left, mid - 1,value);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,185,465,489,746,548,974,5619,564,21,51,84,1,894,9874,86};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr,0,arr.length-1,489);
        if(index == -1){
            System.out.println("Không tìm thấy giá trị trong mảng");
        } else {
            System.out.println("Giá trị được tìm thấy tại vị trí " + index);
        }
    }
}
