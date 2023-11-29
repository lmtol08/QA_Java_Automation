package unitTesting;

public class dataProvider {
   // @DataProvider(name = "myData")
    public Object[][] myData(){
        return new Object[][]{
                {3,5,8},
                {2,5,7},
                {5,5,10}
        };
    }

  //  @Test(groups = {"mytest"}, dataProvider = "myData")
    public void datagivenTest(int a, int b,int expectedResult){
        calculator c = new calculator();
        int result =  c.add(a,b);
       // Assert.assertEquals(result,expectedResult);
    }

    class calculator{
        public int add(int a, int b){
            return a+b;
        }
    }
}

