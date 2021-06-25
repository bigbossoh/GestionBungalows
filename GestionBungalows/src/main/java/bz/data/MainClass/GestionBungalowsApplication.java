package bz.data.MainClass;

import bz.data.MainClass.Dao.Bungalowrepository;
import bz.data.MainClass.Dao.Categoryrepository;
import bz.data.MainClass.Entities.Bungalow;
import bz.data.MainClass.Entities.Category;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.support.Repositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication
public class GestionBungalowsApplication implements CommandLineRunner {
    @Autowired private Categoryrepository categoryrepository;
    @Autowired private Bungalowrepository bungalowrepository;
    @Autowired private RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(GestionBungalowsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Bungalow.class,Category.class);
        categoryrepository.save(new Category(null,"solo",null));
        categoryrepository.save(new Category(null,"double",null));
        categoryrepository.save(new Category(null,"triple",null));
        categoryrepository.save(new Category(null,"groupe",null));
        categoryrepository.findAll().forEach(c->{
             Random rnd =new Random();
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://static.readytotrip.com/upload/information_system_24/1/4/7/item_1471211/information_items_1471211.jpg",(100+rnd.nextInt(600)),c));
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://static.readytotrip.com/upload/information_system_24/1/4/7/item_1471211/information_items_property_13382607.jpg",(100+rnd.nextInt(600)),c));
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://www.assoyam.com/images/accueil/assoyam-chambre-cote-mer.jpg",(100+rnd.nextInt(600)),c));
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://mapio.net/images-p/18850576.jpg",(100+rnd.nextInt(600)),c));
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://p1.storage.canalblog.com/19/21/1481301/112499042_o.jpg",(100+rnd.nextInt(600)),c));
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://i1.wp.com/ivonomad.com/wp-content/uploads/2018/08/les-chambres-las-palmas.jpg?resize=650%2C435",(100+rnd.nextInt(600)),c));
            bungalowrepository.save(new Bungalow(null, RandomString.make(6),RandomString.make(50),
                    "https://images.trvl-media.com/hotels/32000000/31730000/31724800/31724712/e778bf8b.jpg?impolicy=fcrop&w=598&h=338&p=1&q=medium",(100+rnd.nextInt(600)),c));
            System.out.println(c.getName());
        });

    }
}
