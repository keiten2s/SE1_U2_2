public class SortedTest{

    @BeforeEach                                         
    public void setUp() throws Exception {
        sorted = new Sorted();
    }

    @Test                                               
    public void isWellSorted_sortiert_true() {
        String[][] arr = {"D", "C", "B", "A"};
        String[][] comp = {"A", "B", "C", "D"};
        assertEquals(arr, sorted.sortiert(comp),      
        "Array ist sortiert");          
    }
    
    

}