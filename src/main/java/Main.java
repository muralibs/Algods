import dp.*;
import strings.*;
import tree.*;
import recursion.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
	    System.out.println("Hello World!");
	   
	   runningMedian();
	   //printAllWellOrderedPermuationsOfString();
	   //printAllStringPermutations();
	   //magicIndex();
	   //printAllSubsetSum();
	   //printAllDiagonalMatrix();
	  
    }
    
    public static void runningMedian() {
        RunningMedian r = new RunningMedian();
        for(int i = 1; i < 14; i++) {
            r.add(i);
            
        }
        System.out.println("Running median : " + r.findMedian());
    }
    
    public static void 	   printAllWellOrderedPermuationsOfString() {
        WellFormedPermutations w = new WellFormedPermutations();
        char[] arr = "Interview".toCharArray();
        w.permute(arr, 0, arr.length);
    }
    public static void printAllStringPermutations() {
        char[] arr = "abc".toCharArray();
        PrintAllPermutations p = new PrintAllPermutations();
        p.permute(arr, 0, arr.length);
    }
    
    public static void magicIndex() {
        MagicIndex m = new MagicIndex();
        int[] a = { -1, 0, 1, 2, 4, 10 };
        
        System.out.println("Magic Index : " + m.find(a, 0, a.length-1));
    }
    
    public static void printAllSubsetSum() {
        PrintAllSubsetSum p = new PrintAllSubsetSum();
        p.print(4, "");
    }
    
    public static void printAllDiagonalMatrix() {
        int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintAllDiagonalMatrix p = new PrintAllDiagonalMatrix();
        p.print(a);
    }
    
    public static void printTreeZigZag() {
        Node root = createTree();
        PrintTreeZigZag l = new PrintTreeZigZag();
        l.zigZag(root);
    }
    
    public static void printTreeLevelByLevel() {
        Node root = createTree();
        PrintLevelByLevel l = new PrintLevelByLevel();
        l.bfs(root);
    }
    
    public static void 	   levelOrderTraversal() {
        Node root = createTree();
        LevelOrderTraversal l = new LevelOrderTraversal();
        l.bfs(root);
    }
    
    private static Node createTree() {
        Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		return root;
    }
    
    public static void 	   lowestCommonAncesterBST() {
        Node root = new Node(10);
        root.left = new Node(-10);
        root.left.right = new Node(8);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(9);
        
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(60);
        root.right.left.left = new Node(28);
        root.right.left.right = new Node(78);
        
        LowestCommonAncesterBST l = new  LowestCommonAncesterBST();
        Node result = l.LCA(root,  root.right, root.right.left.right) ;
        System.out.println("LCA for 30, 78 is : " + result.data);
    }
    
    public static void nBitStrings() {
        NBitStrings n = new NBitStrings(3);
        n.generate(3);
    }
    
    public static void sortByLastName() {
        ArrayList<String> al = new ArrayList<String>();
		al.add("Daenerys Targaryen");
		al.add("Jon Show");
		al.add("Tyrion Lannister");
		al.add("Joffrey Baratheon");
		System.out.println("Input : " + al);
		LastNameSort l = new LastNameSort();
		l.sortLastName(al);
		
    }
    
    public static void longestSnakeSequence() {
        int arrA [][] = {{1, 2, 1, 2},
                         {7, 7, 2, 5},
                         {6, 4, 3, 4},
                         {1, 2, 2, 5}};
                         
        LongestSnakeInMatrix l = new LongestSnakeInMatrix();
        l.maxSequence(arrA);
    }
    
    public static void countPathsInMatrix() {
        CountAllPathInMatrix c = new CountAllPathInMatrix();
        int arr [][] = {{1,1,1},{1,1,1},{1,1,1}};
        
        
        System.out.println(c.countRecursive(arr, 0, 0));
        System.out.println(c.countDP(arr));
        
    }

    public static void findTreeHeight() {
        Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.left.left.left =new Node(30);
		root.left.right.left = new Node(35);
		root.left.right.left.left = new Node(40);
		root.left.right.left.left.right = new Node(45);
	    root.left.right.left.left.right.left = new Node(50);
	    
	    FindTreeHeight h = new FindTreeHeight();
	    System.out.println(h.getTreeHeight(root));
	    
	    //find node height
	    System.out.println("Node 30 height : " + h.getNodeHeight(root, root.left.left.left, 0) );
    }     
    
    public static void longestincreasingSubsequence()  {
        LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
        int[] arr = { 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
        
        l.findSubsequence(arr);
    }
    
    public static void stairClimbingPuzzle() {
        
        int steps = 3;
        
        StairClimbingPuzzle s = new StairClimbingPuzzle();
        System.out.println("Recursive Solution :" + s.possibleWays(steps));
        
        //dp solution
        int[] dyn = new int[steps + 1];
        System.out.println("DP Solution : " + s.dpPossibleWays(steps, dyn));
        
    }
    
    
    public static void replaceStringWithPercent20() {
        String input = "My Name Is Murali";
        ReplaceSpaceWithPercent20 r = new ReplaceSpaceWithPercent20();
        System.out.println("Output : " + r.replace(input));
    }
    
    public static void longestPrefixInString() {
        LongestPrefixInString l = new  LongestPrefixInString();
        
        System.out.println(l.findPrefix("Bed­room Bed­Clock Bed­Table Bed­Wall"));
    }


    public static void uniqueCharStringCheck() {
        UniqueCharString u = new UniqueCharString();
        
        System.out.println("is unique " + u.isUnique("string"));
        
    }

    public static void 	   printAllPathsInAMaze() {
        int[][] a = {{1,2,3},
                     {4,5,6}};
        
        PrintAllPathsInMaze p = new PrintAllPathsInMaze(a);
        p.printAll(0,0,"");
        
        
    }
    
    public static void towerOfHanoi() {
        TowerOfHanoi t = new TowerOfHanoi();
        
        t.solve(3, "A", "B", "C");
    }
    
    public static void ratInAMaze() {
        int N = 5;
		int[][] maze = { { 1, 0, 1, 1, 1 },
		                 { 1, 1, 1, 0, 1 },
		                 { 1, 0, 0, 1, 1 },
				         { 1, 0, 0, 1, 0 },
				         { 0, 1, 0, 1, 1 } };
        
        RatInAMaze r = new RatInAMaze(N);
        r.solveMaze(maze, N);
        
    }
    
    public static void findKthSmallestElementInArray() {
        int[] arr = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
        int k = 4;
        FindKthSmallestElement f = new FindKthSmallestElement();
        System.out.println("Finding kth element in array: " + f.find(arr, k));
    }
    
    public static void findElementInMatrix() {
        
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9},{10,11,12}};
        
        FindElementInMatrix f = new FindElementInMatrix();
        
        System.out.println("Element 9 in matrix : " + f.find(matrix, 11));
        
        
    }
    
    public static void greedyMinCoins() {
        
        GreedyMinCoins gr = new GreedyMinCoins();
        gr.printMinCoins(93);
    }
    
    public static void isSubString() {
     WordSubString w = new WordSubString();
        boolean result = w.isSubString("erbottlewat", "waterbottle12");
        
        System.out.println("Is Substring: " + result);
     
    }
    
    public static void rotateMatrixBy90Degrees() {
        int[][] arr = 
    {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };
        RotateMatrixBy90Degree r = new RotateMatrixBy90Degree();
        r.rotate(arr);
    
    }
    
    public static void rotateArrayKTimes() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        RotateArrayKTimes r = new RotateArrayKTimes();
        r.rotate(arr, 3);
    }
    
    public static void findMaxProductSubArray() {
        int[] arr = {1, 5, 9, 8, 2, 4, 1, 8, 1, 2};
        int k = 6;
        
        FindMaxProductSubArray f = new FindMaxProductSubArray();
        int x = f.find(arr, k);
        System.out.println("Max product Sub array : " + x);
    }
    
    
    
    public static void equalSumSubArrays() {
        EqualSumSubArrays s = new EqualSumSubArrays();
        
        int[] arr = {6, 2, 3, 2, 1};
        
        s.divideArrays(arr);
        
    }
    public static void majorityElement() {
        
    }
    public static void anagramCheck() {
        String s = "anagram";
        String t = "nagaram";
        Anagram anagram = new Anagram();
        System.out.println("They are :"+ anagram.isAnagram(s, t));
        
    }
    public static void arrayIntersection() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        ArrayIntersection ai = new ArrayIntersection();
        int[] result = ai.intersection(nums1, nums2);
        for(int i: result) {
            System.out.println(i);
        }
    }
    
    public static void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes m = new MoveZeroes();
        m.move(nums);
    }
    
    public static void addDigits() {
        AddDigitsLeetCode a = new AddDigitsLeetCode();
	    int ans = a.addDigits1(358);
	    
	    System.out.println("AddDigitsLeetCode ans : " +  ans );
    }
    
    
    //printTreeZigZag();
	   //printTreeLevelByLevel();
	   //levelOrderTraversal();
	   //lowestCommonAncesterBST();
	   //nBitStrings();
	   //sortByLastName();
	   //longestSnakeSequence() ;
	   
	   //countPathsInMatrix();
	   
	   //findTreeHeight();
	   
	   //longestincreasingSubsequence();
	   
	   //stairClimbingPuzzle();
	   
     //replaceStringWithPercent20();
	   
	   //longestPrefixInString();
	   //uniqueCharStringCheck();
	   
	   
	   //printAllPathsInAMaze();
	   
	   
	   //towerOfHanoi();
	   
	   //ratInAMaze();
	   
	   //findKthSmallestElementInArray();
	   //findElementInMatrix();
	   //greedyMinCoins();
	   
	   //isSubString();
	   
	   //rotateMatrixBy90Degrees();
	   //rotateArrayKTimes();
	   //findMaxProductSubArray();
	   //equalSumSubArrays();
	   //majorityElement();
	   //anagramCheck();
	   //arrayIntersection();
	    //addDigits();
	    //moveZeroes();
}
