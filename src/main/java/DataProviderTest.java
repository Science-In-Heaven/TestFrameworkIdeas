import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class DataProviderTest {

    @DataProvider
    public static Object[][] getData() {
        Object[][] dataSources = new MainDataSource[2][1];

        MainDataSource dataSource = new MainDataSource();
        dataSource.setName("It's my test data string!");
        dataSources[0][0] = dataSource;

        MainDataSource dataSource2 = new MainDataSource();
        dataSource2.setName("It's my second test data string!");
        dataSources[1][0] = dataSource2;
        return dataSources;
    }

    @Test
    @UseDataProvider("getData")
    public void runWithData(MainDataSource testData) {
        System.out.format("Printing...\n'%s'", testData.getName());
    }


    private static class MainDataSource {


        private LinkedHashMap<String, String> standConfig;
        private LinkedHashMap<String, Boolean> flags;
        private String name;

        MainDataSource(){}

        MainDataSource(String path, String daileName) {

        }

        public LinkedHashMap<String, String> getStandConfig() {
            return standConfig;
        }

        public void setStandConfig(LinkedHashMap<String, String> standConfig) {
            this.standConfig = standConfig;
        }

        public LinkedHashMap<String, Boolean> getFlags() {
            return flags;
        }

        public void setFlags(LinkedHashMap<String, Boolean> flags) {
            this.flags = flags;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
}
