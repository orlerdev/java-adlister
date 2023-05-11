package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class UserPosts {

    public static ArrayList<Post> allPosts = new ArrayList<>(Arrays.asList(generatePosts()));

    public static ArrayList<User> generateUsers(){
        User user1 = new User("johndoe", "johndoe@example.com", "password123");
        User user2 = new User("janedoe", "janedoe@example.com", "password456");
        User user3 = new User("bobsmith", "bobsmith@example.com", "password789");
        User user4 = new User("sarahjones", "sarahjones@example.com", "passwordabc");
        User user5 = new User("mikebrown", "mikebrown@example.com", "passworddef");
        User user6 = new User("YunaKim", "yunakim@example.com", "password123");
        User user7 = new User("ChenWei", "chenwei@example.com", "password456");
        User user8 = new User("KwameAgyei", "kwameagyei@example.com", "password789");
        User user9 = new User("FatimaGarcia", "fatimagarcia@example.com", "passwordabc");
        User user10 = new User("TakeshiNakamura", "takeshinakamura@example.com", "passworddef");
        User user11 = new User("AmiraKhan", "amirakhan@example.com", "password123");
        User user12 = new User("LuisFernandez", "luisfernandez@example.com", "password456");
        User user13 = new User("JabariSoweto", "jabarisoweto@example.com", "password789");
        User user14 = new User("NadiaAbdullah", "nadiaabdullah@example.com", "passwordabc");
        User user15 = new User("SeungLee", "seunglee@example.com", "passworddef");
        User user16 = new User("AidenPatel", "aidenpatel@example.com", "password123");
        User user17 = new User("JiaLing", "jialing@example.com", "password456");
        User user18 = new User("TamaToa", "tamatoa@example.com", "password789");
        User user19 = new User("PriyaKumar", "priyakumar@example.com", "passwordabc");
        User user20 = new User("SioneTonga", "sionetonga@example.com", "passworddef");

// Create an ArrayList to store User objects
        ArrayList<User> userList = new ArrayList<>();

// Add the User objects to the ArrayList
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);
        userList.add(user11);
        userList.add(user12);
        userList.add(user13);
        userList.add(user14);
        userList.add(user15);
        userList.add(user16);
        userList.add(user17);
        userList.add(user18);
        userList.add(user19);
        userList.add(user20);
        return userList;
    }

    public static User randomUser() {

        ArrayList<User> users = generateUsers();
        int numUsers = users.size();
        Random random = new Random();
        int randomIndex = random.nextInt(numUsers);

        return users.get(randomIndex);
    }

    public static Post[] generatePosts(){
        Post[] posts = {
                new Post("The Rise of Artificial Intelligence", "Artificial intelligence (AI) is a field of computer science that aims to create machines capable of performing tasks that would normally require human intelligence. With recent advances in machine learning and natural language processing, AI has become increasingly sophisticated, and is now being used in a wide range of applications, from virtual assistants to self-driving cars."),
                new Post("The Future of Quantum Computing", "Quantum computing is a rapidly developing field that aims to harness the power of quantum mechanics to solve complex computational problems. Unlike classical computers, which process information in binary form (0s and 1s), quantum computers use quantum bits (qubits) that can exist in multiple states at once. This gives quantum computers the potential to solve problems that are currently beyond the capabilities of classical computers, such as simulating complex chemical reactions and optimizing logistics networks."),
                new Post("The Pros and Cons of Cloud Computing", "Cloud computing has become an increasingly popular way to store and access data and applications over the internet. The benefits of cloud computing include flexibility, scalability, and cost savings, since users only pay for the resources they use. However, there are also concerns about security and data privacy, as well as the potential for vendor lock-in."),
                new Post("The Impact of Social Media on Society", "Social media has transformed the way we communicate, share information, and form relationships. On the one hand, social media has made it easier than ever to connect with people all over the world and to access a wealth of information. On the other hand, there are concerns about the impact of social media on mental health, privacy, and the spread of misinformation."),
                new Post("The Evolution of Video Games", "Video games have been around for decades, and have evolved from simple arcade games to complex, immersive experiences. Along the way, video games have influenced popular culture, inspired new technologies, and even challenged our understanding of what it means to be human. Today, video games are a multi-billion dollar industry, with millions of players all over the world."),
                new Post("The Ethics of Artificial Intelligence", "As artificial intelligence (AI) becomes more advanced, questions of ethics and morality are becoming increasingly important. AI has the potential to improve many aspects of our lives, from healthcare to transportation, but it also raises concerns about job displacement, bias, and the potential for unintended consequences. To ensure that AI is developed and used responsibly, it is crucial to have a framework of ethical principles and guidelines."),
                new Post("The History of Computing", "Computing has a rich and fascinating history, with many interesting characters and inventions. From the abacus to the calculator, from punch cards to mainframes, from the internet to the smartphone, the history of computing is a story of human ingenuity and innovation. By understanding this history, we can gain insights into the evolution of technology and its impact on society."),
                new Post("The Importance of Cybersecurity", "In a world where so much of our lives takes place online, cybersecurity is more important than ever. Cyberattacks can result in everything from stolen personal information to disrupted infrastructure, and can have serious consequences for individuals, businesses, and even entire nations. To protect against cyber threats, it is essential to have strong cybersecurity measures in place, as well as a culture of awareness and vigilance."),
                new Post("The Ethics of Gene Editing", "Gene editing has the potential to cure diseases and improve human health, but it also raises important ethical questions about the limits of human intervention in nature. Scientists and policymakers must carefully consider the risks and benefits of gene editing and ensure that it is used responsibly."),
                new Post("The Future of 3D Printing", "3D printing is revolutionizing manufacturing and has the potential to transform many industries, from aerospace to medicine. In the future, it could be possible to print everything from houses to human organs, but there are still many technical and logistical challenges that need to be overcome."),
                new Post("The Impact of Artificial Intelligence on Jobs", "Artificial intelligence is rapidly transforming the economy and the labor market, creating new opportunities for some workers while displacing others. Policymakers and business leaders must ensure that the benefits of AI are shared equitably and that workers are prepared for the jobs of the future."),
                new Post("The Pros and Cons of Virtual Reality", "Virtual reality has the potential to revolutionize many industries, from entertainment to healthcare, but it also raises important questions about the effects of simulated experiences on our brains and our perceptions of reality. As VR becomes more widespread, it is important to carefully consider its benefits and risks."),
                new Post("The Role of Blockchain in Finance", "Blockchain technology has the potential to disrupt the finance industry by providing more secure and transparent ways of conducting transactions. However, there are still many technical and regulatory challenges that need to be addressed before blockchain can become a mainstream solution for financial services."),
                new Post("The Benefits and Drawbacks of Remote Work", "Remote work has become increasingly common in recent years, with many companies allowing their employees to work from home or other locations. While there are many benefits to remote work, such as increased flexibility and improved work-life balance, there are also some drawbacks, such as the lack of in-person communication and potential feelings of isolation."),
                new Post("The Evolution of Social Media", "Social media has come a long way since the early days of Myspace and Friendster. Today, platforms like Facebook, Instagram, and Twitter are an integral part of many people's lives, with billions of users worldwide. As social media continues to evolve, it's important to consider both the positive and negative impacts it has on society."),
                new Post("The Future of Artificial Intelligence in Healthcare", "Artificial intelligence has the potential to revolutionize healthcare, from improving diagnoses and treatments to streamlining administrative tasks. While there are some concerns about the ethics and privacy implications of using AI in healthcare, many experts believe that it has the potential to save lives and improve patient outcomes."),
                new Post("The Ethics of Genetic Engineering", "Genetic engineering has the potential to cure diseases, improve crop yields, and even create new forms of life. However, there are also many ethical concerns surrounding the use of this technology, such as the potential for unintended consequences and the impact on biodiversity. As we continue to develop and use genetic engineering, it's important to carefully consider these ethical implications."),
                new Post("The Impact of Climate Change on Society", "Climate change is one of the most pressing issues facing our planet today. From rising sea levels to more frequent natural disasters, the effects of climate change are already being felt around the world. As we work to address this issue, it's important to consider the ways in which climate change will impact society, from economic and social inequalities to political instability and migration."),
                new Post("The Power of Artificial Intelligence in Business", "Artificial intelligence is transforming the business world, enabling companies to improve efficiency, reduce costs, and gain insights into customer behavior. From chatbots to predictive analytics, AI is helping businesses of all sizes to stay competitive in today's fast-paced digital landscape."),
                new Post("The Ethics of Gene Editing", "Gene editing has the potential to revolutionize medicine, allowing us to cure genetic diseases and even enhance human capabilities. But with great power comes great responsibility, and questions of ethics and morality must be carefully considered. Who decides what traits are desirable? How can we ensure that the technology is used for the benefit of all humanity, rather than just a select few? These are just some of the complex questions that arise when we start to tamper with the very fabric of life.")
        };

        for (Post post : posts) {
            post.setUser(randomUser());
        }

        return posts;

    }
}
