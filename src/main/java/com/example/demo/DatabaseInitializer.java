package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.model.book.Book;
import com.example.demo.model.order.Buy;
import com.example.demo.model.order.Order;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;

@Component
public class DatabaseInitializer implements CommandLineRunner {

        private final UserRepository userRepository;
        private final BookRepository bookRepository;
        private final OrderRepository orderRepository;

        public DatabaseInitializer(UserRepository userRepository, BookRepository bookRepository,
                        OrderRepository orderRepository) {
                this.userRepository = userRepository;
                this.bookRepository = bookRepository;
                this.orderRepository = orderRepository;
        }

        @Override
        public void run(String... args) throws Exception {

                Book book0 = new Book("张嘉佳十年文集限定礼盒", "张嘉佳 著,博集天卷 出品", "9781305518544",
                                "张嘉佳十年文集限定礼盒（当当专享张嘉佳亲笔签名纪念信+手写寄语明信片+30*60cm精美桌垫+书签+护照册+旅行地图折页）",
                                "//img3m3.ddimg.cn/36/9/29413233-1_l_16.jpg", "小说", 100.00);
                bookRepository.save(book0);
                Book book1 = new Book("生而为人", "毕啸南 著,博集天卷 出品", "9784142675746", "生而为人",
                                "//img3m0.ddimg.cn/59/24/29520770-1_l_1702361665.jpg", "小说", 24.90);
                bookRepository.save(book1);
                Book book2 = new Book("尘埃落定：限量签章版", "阿来", "9788176856645", "尘埃落定：限量签章版（荣获茅盾文学奖20周年纪念版！特别加赠阿来故乡风景卡片三幅！)",
                                "//img3m1.ddimg.cn/2/2/29131841-1_l_1702950256.jpg", "小说", 24.50);
                bookRepository.save(book2);
                Book book3 = new Book("欢迎来到人间", "毕飞宇", "9781703801408", "欢迎来到人间（毕飞宇新作，当当专享签名本）",
                                "//img3m0.ddimg.cn/92/13/29599310-1_l_1693880977.jpg", "小说", 46.60);
                bookRepository.save(book3);
                Book book4 = new Book("告别的年代", "（马来西亚）黎紫书 著 ，新经典  出品", "9780713984590",
                                "告别的年代（当当专享签名本。《亚洲*周刊》2010年度十大小说！王德威、止庵、蒋韵、杨照、黄锦树、骆以军联袂推荐）",
                                "//img3m8.ddimg.cn/72/35/29457918-1_l_1702369965.jpg", "小说", 30.20);
                bookRepository.save(book4);
                Book book5 = new Book("沿途(陆天明新作，当当专享印章版", "陆天明", "9783876699165", "沿途(陆天明新作，当当专享印章版）",
                                "//img3m8.ddimg.cn/50/14/29586398-1_l_3.jpg", "小说", 41.60);
                bookRepository.save(book5);
                Book book6 = new Book("五湖四海", "王安忆", "9788677314132", "五湖四海（当当专享王安忆亲签限量版）",
                                "//img3m7.ddimg.cn/90/6/29443977-1_l_3.jpg", "小说", 41.60);
                bookRepository.save(book6);
                Book book7 = new Book("十二楼谜案", "宁航一", "9783763755028",
                                "十二楼谜案（当当专属签名本，《超禁忌秘密》《十四分之一》作者宁航一新作，紫金陈撰语推荐，同名S级影视剧高热改编中）",
                                "//img3m5.ddimg.cn/92/16/29592875-1_l_1699945473.jpg", "小说", 44.90);
                bookRepository.save(book7);
                Book book8 = new Book("第二个安娜", "[韩]郑韩雅", "9780074252475", "第二个安娜",
                                "//img3m3.ddimg.cn/89/11/29610593-1_l_1691376266.jpg", "小说", 40.60);
                bookRepository.save(book8);
                Book book9 = new Book("白色巨塔", "山崎丰子", "9781111273828", "白色巨塔",
                                "//img3m3.ddimg.cn/18/22/28971873-1_l_11.jpg",
                                "小说", 70.98);
                bookRepository.save(book9);
                Book book10 = new Book("人生海海 ", "麦家  著 ， 新经典   出品", "9780677257839",
                                "人生海海 （麦家长篇超越之作。莫言、董卿盛赞。赠作者寄语卡。董宇辉推荐，海海人生愈行愈开阔）",
                                "//img3m9.ddimg.cn/76/13/29607709-1_l_1697100722.jpg",
                                "小说", 37.90);
                bookRepository.save(book10);
                Book book11 = new Book("孔雀菩提", "焦典  著 ，新经典  出品", "9785957122203",
                                "孔雀菩提（莫言：焦典对小说的领悟力，让我既欣慰又羡慕。余华推荐。青年作家焦典小说集）",
                                "//img3m2.ddimg.cn/48/7/29610552-1_l_1701326807.jpg", "小说", 26.90);
                bookRepository.save(book11);
                Book book12 = new Book("献给阿尔吉侬的花束", "（美）丹尼尔·凯斯 著，理想国 出品", "9788092650808", "献给阿尔吉侬的花束（新版）",
                                "//img3m6.ddimg.cn/83/6/29442386-1_l_14.jpg", "小说", 38.00);
                bookRepository.save(book12);
                Book book13 = new Book("失明症漫记", "[葡]若泽·萨拉马戈（José Saramago）；范维信 译；读客文化 出品", "9787941040517",
                                "失明症漫记（诺奖得主萨拉马戈传世之作！一旦对他人的苦难视而不见，苦难就会在我们中间蔓延。）（读客彩条外国文学文库）",
                                "//img3m2.ddimg.cn/14/7/29444792-1_l_25.jpg", "小说", 33.00);
                bookRepository.save(book13);
                Book book14 = new Book("雪国【当当定制雪国美景明信片】川", "[日]川端康成 著，酷威文化 出品", "9785772744314",
                                "雪国【当当定制雪国美景明信片】川端康成50周年纪念版",
                                "//img3m4.ddimg.cn/47/10/29520164-1_l_2.jpg", "小说", 19.90);
                bookRepository.save(book14);
                Book book15 = new Book("宝水", "乔叶  著 ，新经典  出品", "9780741194145",
                                "宝水（第11届茅盾文学奖获奖作品，2022中国好书，莫言、格非、周大新、孙郁、徐则臣、张莉诚挚推荐）",
                                "//img3m7.ddimg.cn/81/32/29483667-1_l_1691727495.jpg", "小说", 37.40);
                bookRepository.save(book15);
                Book book16 = new Book("马伯庸见微系列套装：长安的荔枝+", "马伯庸 著,博集天卷 出品", "9787994594661", "马伯庸见微系列套装：长安的荔枝+太白金星有点烦",
                                "//img3m5.ddimg.cn/74/17/29580185-1_l_3.jpg", "小说", 58.00);
                bookRepository.save(book16);
                Book book17 = new Book("刘震云作品选全6册", "刘震云", "9782464586009",
                                "刘震云作品选全6册（一句顶一万句+一日三秋+我不是潘金莲+我叫刘跃进+温故一九四二+一地鸡毛）",
                                "//img3m3.ddimg.cn/0/5/29437353-1_l_9.jpg", "小说", 184.00);
                bookRepository.save(book17);
                Book book18 = new Book("茶人四部曲", "王旭烽", "9787996314823", "茶人四部曲（全新修订，重磅集结。带你领略纸上杭州，诗画江南。附赠人物谱系图）",
                                "//img3m7.ddimg.cn/3/23/29559027-1_l_7.jpg", "小说", 149.60);
                bookRepository.save(book18);
                Book book19 = new Book("俗世奇人", "冯骥才", "9780618449927", "俗世奇人（全四册，赠笔记本）冯骥才“俗世奇人系列”全部作品72篇，入选中小学生阅读指导目录。",
                                "//img3m5.ddimg.cn/53/11/29518685-1_l_3.jpg", "小说", 42.00);
                bookRepository.save(book19);
                Book book20 = new Book("爱尔兰命运五部曲", "[爱尔兰]塞巴斯蒂安·巴里", "9789236186641", "爱尔兰命运五部曲（典藏套装共5册）",
                                "//img3m0.ddimg.cn/55/2/29588680-1_l_1692931971.jpg", "小说", 191.20);
                bookRepository.save(book20);
                Book book21 = new Book("阿加莎·克里斯蒂侦探小说全集：精", "[英]阿加莎·克里斯蒂 著，王霖 等 译", "9784249749111",
                                "阿加莎·克里斯蒂侦探小说全集：精装典藏版（全84册） （午夜文库标志性红壳圆脊精装）",
                                "//img3m7.ddimg.cn/91/10/29576737-1_l_1688697880.jpg",
                                "小说", 3749.2);
                bookRepository.save(book21);
                Book book22 = new Book("茅盾文学获奖作品集套装40部共78册", "徐贵祥", "9780632778638", "茅盾文学获奖作品集套装40部共78册",
                                "//img3m7.ddimg.cn/79/1/410298847-1_l_1693287614.jpg", "小说", 3094.0);
                bookRepository.save(book22);
                Book book23 = new Book("古龙武侠72册大合集", "古龙；读客文化 出品", "9789215791729",
                                "古龙武侠72册大合集（收藏古龙，就是这套72册大合集！目前中国大陆地区最全的古龙小说集！当当专享定制古龙武侠人物明信片）",
                                "//img3m5.ddimg.cn/66/36/29562555-1_l_6.jpg", "小说", 1999.5);
                bookRepository.save(book23);
                Book book24 = new Book("燕食记", "葛亮", "9789358166873", "燕食记（2023第十一届茅奖文学奖十强；当当专项藏书票版；江南岭南风日好，世道味道总关情）",
                                "//img3m0.ddimg.cn/21/6/29438760-1_l_1692767299.jpg", "小说", 42.90);
                bookRepository.save(book24);
                Book book25 = new Book("命运", "蔡崇达，果麦文化 出品", "9789348397409",
                                "命运（蔡崇达新书，畅销400万册《皮囊》作者长篇新作。刘德华、韩寒、白岩松、李敬泽、程永新联袂推荐！一个人的无常，所有人的命运）",
                                "//img3m3.ddimg.cn/47/1/29458883-1_l_26.jpg", "小说", 29.90);
                bookRepository.save(book25);
                Book book26 = new Book("望江南", "王旭烽", "9783250834571",
                                "望江南（2022中国好书获奖作品！你一句春不晚，我就到了真江南。茅奖得主王旭烽，沉潜26年，最新长篇小说力作。）",
                                "//img3m0.ddimg.cn/74/5/29367830-1_l_45.jpg", "小说", 37.40);
                bookRepository.save(book26);
                Book book27 = new Book("大清相国", "王跃文", "9789583400438", "大清相国（畅销百万册！大清相国的职场破局！）",
                                "//img3m2.ddimg.cn/25/24/29479552-1_l_24.jpg", "小说", 34.00);
                bookRepository.save(book27);
                Book book28 = new Book("奥斯维辛：寂静的城市", "〔意〕普里莫·莱维 著，法比奥·莱维、多梅尼科·斯卡帕 选编，陈英 孙璐瑶 译", "9781578084418",
                                "奥斯维辛：寂静的城市（意大利国宝级作家、奥斯维辛174517号囚犯 普里莫·莱维特别纪念文集）",
                                "//img3m6.ddimg.cn/55/3/29599966-1_l_1692769212.jpg",
                                "小说", 18.20);
                bookRepository.save(book28);
                Book book29 = new Book("群山之巅", "迟子建", "9784203292011", "群山之巅（著名作家迟子建长篇力作。比《额尔古纳河右岸》更苍茫雄浑，比《白雪乌鸦》更跌宕精彩）",
                                "//img3m6.ddimg.cn/64/21/29551366-1_l_1.jpg", "小说", 24.90);
                bookRepository.save(book29);
                Book book30 = new Book("上元灯彩图", "宋方金", "9786223509346", "上元灯彩图",
                                "//img3m5.ddimg.cn/39/9/29558865-1_l_8.jpg",
                                "小说", 29.00);
                bookRepository.save(book30);
                Book book31 = new Book("晚春", "三三", "9781283516792",
                                "晚春（余华赞赏的90后小说家：“三三是个好作家。”郁达夫小说奖得主三三新书。晚景皆成幻梦，春色何以动人）",
                                "//img3m6.ddimg.cn/73/30/29577016-1_l_4.jpg", "小说", 44.20);
                bookRepository.save(book31);
                Book book32 = new Book("装腔启示录", "柳翠虎 著,博集天卷 出品", "9785505311981",
                                "装腔启示录（芒果TV官宣同名电视剧！人间装腔观察实录，都市男女互撩手册）",
                                "//img3m7.ddimg.cn/13/16/29345197-1_l_1693214693.jpg", "小说", 24.00);
                bookRepository.save(book32);
                Book book33 = new Book("人生", "路遥  著 ，新经典  出品", "9788077973052",
                                "人生（茅盾文学奖得主路遥作品，电视剧《人生之路》原著，陈晓、李沁、张嘉倪主演。高加林一代青年冲开困境，去往人生新“路”。）",
                                "//img3m1.ddimg.cn/38/0/29267111-1_l_6.jpg", "小说", 27.20);
                bookRepository.save(book33);
                Book book34 = new Book("海风中失落的血色馈赠", "[加]阿利斯泰尔·麦克劳德", "9784285096866", "海风中失落的血色馈赠（阿利斯泰尔·麦克劳德作品集）",
                                "//img3m0.ddimg.cn/52/17/29224060-1_l_1695622082.jpg", "小说", 20.70);
                bookRepository.save(book34);
                Book book35 = new Book("世界上所有的夜晚", "迟子建", "9789314996810", "世界上所有的夜晚（茅盾文学奖、鲁迅文学奖得主迟子建小说代表作）",
                                "//img3m5.ddimg.cn/81/16/29295765-1_l_7.jpg", "小说", 39.40);
                bookRepository.save(book35);
                Book book36 = new Book("往事：沈从文小说选【当当定制湘西", "沈从文 著，酷威文化 出品", "9786873045607",
                                "往事：沈从文小说选【当当定制湘西蜡染邮票贴纸+山川往事邮票贴纸】沈从文诞辰120周年典藏纪念版",
                                "//img3m4.ddimg.cn/28/28/29494504-1_l_4.jpg", "小说",
                                22.50);
                bookRepository.save(book36);
                Book book37 = new Book("短经典精选系列：炽焰燃烧", "〔美〕罗恩·拉什", "9789014158334",
                                "短经典精选系列：炽焰燃烧（软精装）（美国南方文学代表作家罗恩拉什扛鼎之作，弗兰克奥康纳国际短篇小说奖桂冠作品，短经典口碑神作再版）",
                                "//img3m0.ddimg.cn/90/21/29543670-1_l_3.jpg", "小说", 30.40);
                bookRepository.save(book37);
                Book book38 = new Book("告别的夜晚", "王瑢", "9788085119695", "告别的夜晚",
                                "//img3m4.ddimg.cn/43/23/29580154-1_l_2.jpg",
                                "小说", 24.80);
                bookRepository.save(book38);
                Book book39 = new Book("关于女儿", "金惠珍 著，简郁璇 译", "9789266742435", "关于女儿（《82年生的金智英》强有力的继承者 /获奖/好评如潮）",
                                "//img3m8.ddimg.cn/21/9/29472618-1_l_5.jpg", "小说", 31.50);
                bookRepository.save(book39);
                Book book40 = new Book("白鸟与蝙蝠", "（日）东野圭吾  著 ， 新经典  出品", "9782566102046", "白鸟与蝙蝠（东野圭吾出道35周年，荣耀新高峰！）",
                                "//img3m1.ddimg.cn/36/28/29510451-1_l_8.jpg", "小说", 37.90);
                bookRepository.save(book40);
                Book book41 = new Book("非自然死亡：我的法医笔记", "刘晓辉 著，真故图书 出品", "9789370994751",
                                "非自然死亡：我的法医笔记（法医秦明冠名推荐，15年法医生涯，19宗真实案件改编。全网阅读超1亿人次！）",
                                "//img3m9.ddimg.cn/13/7/29177689-1_l_65.jpg",
                                "小说", 35.80);
                bookRepository.save(book41);
                Book book42 = new Book("河边的错误 (最新版)   余华先锋代", "余华", "9781874126904",
                                "河边的错误 (最新版)   余华先锋代表作  朱一龙主演戛纳入围电影同名小说",
                                "//img3m8.ddimg.cn/47/1/29587088-1_l_1688552545.jpg", "小说", 32.80);
                bookRepository.save(book42);
                Book book43 = new Book("第四扇门", "[法]保罗·霍尔特；读客文化 出品", "9786834292248",
                                "第四扇门（凶宅凶案频发，闹鬼的背后是一连串的骗局和谋杀。不可能犯罪之王保罗·霍尔特绝版多年的推理神作！）（读客悬疑文库）",
                                "//img3m4.ddimg.cn/32/30/29603804-1_l_1691726889.jpg", "小说", 22.50);
                bookRepository.save(book43);
                Book book44 = new Book("莱博维茨的赞歌", "[美]小沃尔特·M.米勒；读客文化 出品", "9786199518250",
                                "莱博维茨的赞歌（罗翔推荐！《时代》“史上TOP伟大的科幻”，一切废土题材的起源。雨果奖桂冠，30年稳居《轨迹》TOP10）读客科幻文库",
                                "//img3m8.ddimg.cn/66/34/29558298-1_l_3.jpg", "小说", 24.90);
                bookRepository.save(book44);
                Book book45 = new Book("丹松少女", "（墨）豪尔赫·伊瓦尔根戈伊蒂亚 原著 ，新经典  出品", "9786083403006",
                                "丹松少女（比肩《一桩事先张扬的凶杀案》！二十世纪百部最佳西班牙语小说！）",
                                "//img3m1.ddimg.cn/55/1/29610361-1_l_1691403175.jpg", "小说",
                                26.90);
                bookRepository.save(book45);
                Book book46 = new Book("玻璃塔谜案：当当专供随书附赠精美", "知念实希人 著，磨铁文化 出品", "9784297425135",
                                "玻璃塔谜案：当当专供随书附赠精美书签（密室、神反转、挑战读者、血字密码、暴风雪山庄……满足你对推理小说的所有想象，“馆”系列集大成之作，岛田庄司亲自撰文推荐）",
                                "//img3m3.ddimg.cn/94/34/29517043-1_l_1691645071.jpg", "小说", 34.00);
                bookRepository.save(book46);
                Book book47 = new Book("密室黄金时代的杀人事件", "(日) 鸭崎暖炉 著；佟凡 译；星文文化 出品", "9788232878543",
                                "密室黄金时代的杀人事件（第20届“这推理小说了不起！”大奖作品！惊艳日本文坛的本格推理突破之作）",
                                "//img3m5.ddimg.cn/66/14/29548695-1_l_6.jpg", "小说",
                                24.90);
                bookRepository.save(book47);
                Book book48 = new Book("她穿过了暴雨", "独木舟，果麦文化 出品", "9786584452190",
                                "她穿过了暴雨（独木舟重磅新书，人这一生，只有穿过一场场生活的暴雨，才能找到真正的自己）",
                                "//img3m5.ddimg.cn/15/14/29666355-1_l_1703472789.jpg", "小说", 34.00);
                bookRepository.save(book48);
                Book book49 = new Book("法医之书", "秦明 著，磨铁文化 出品", "9784907728618", "法医之书",
                                "//img3m8.ddimg.cn/92/15/29665838-1_l_1702957815.jpg", "小说", 46.00);
                bookRepository.save(book49);
                Book book50 = new Book("爸爸是只狗", "王小列 著  时代华语 出品", "9781448761722", "爸爸是只狗（当当专享《再见，李可乐》原著小说签名版）",
                                "//img3m5.ddimg.cn/48/16/29649855-1_l_1702276583.jpg", "小说", 26.00);
                bookRepository.save(book50);
                Book book51 = new Book("星官出征", "孟川，果麦文化 出品", "9780650707757",
                                "星官出征（孟川长篇喜剧小说，接连爆梗，爆笑不断！当当独家特供印孟川卡通形象与印签）",
                                "//img3m5.ddimg.cn/87/5/29660685-1_l_1702288778.jpg", "小说", 29.90);
                bookRepository.save(book51);
                Book book52 = new Book("半小时漫画红楼梦2 ", "陈磊·半小时漫画团队；读客文化 出品", "9784641494466",
                                "半小时漫画红楼梦2 （专治没耐心读红楼梦，这回终于算是读完红楼梦了！ 北京曹学会专家审定推荐 赠人物关系海报）半小时漫画文库",
                                "//img3m3.ddimg.cn/40/27/29659153-1_l_1701235850.jpg", "小说", 38.90);
                bookRepository.save(book52);
                Book book53 = new Book("恶行", "〔德〕费迪南德·冯·席拉赫  著 ，新经典  出品", "9784117563290",
                                "恶行（知名刑事律师将真实案件化为锋利故事，零距离凝视人性深渊。絶版十年，詹青云推荐！）",
                                "//img3m3.ddimg.cn/93/18/29666433-1_l_1703492330.jpg",
                                "小说", 32.40);
                bookRepository.save(book53);
                Book book54 = new Book("她穿过了暴雨", "独木舟，果麦文化 出品", "9787799151519",
                                "她穿过了暴雨（独木舟重磅新书，人这一生，只有穿过一场场生活的暴雨，才能找到真正的自己）",
                                "//img3m7.ddimg.cn/0/10/29669607-1_l_1703147383.jpg", "小说", 34.00);
                bookRepository.save(book54);
                Book book55 = new Book("你听得见", "应橙 著，磨铁文化 出品", "9788752299361", "你听得见",
                                "//img3m6.ddimg.cn/42/9/29642226-1_l_1698145229.jpg", "小说", 35.80);
                bookRepository.save(book55);
                Book book56 = new Book("人鼠之间", "[美]约翰·斯坦贝克 著，磨铁文化 出品", "9785919701576", "人鼠之间",
                                "//img3m9.ddimg.cn/98/27/29634659-1_l_1696726787.jpg", "小说", 19.90);
                bookRepository.save(book56);
                Book book57 = new Book("不做告别：亚洲首位布克国际文学奖得主韩江《少年来了》后，再次书写国家暴力、大屠杀。文在寅推荐！荣膺2023法国美第奇文学奖！", "韩江 著，磨铁文化 出品",
                                "9782272214088", "不做告别：亚洲首位布克国际文学奖得主韩江《少年来了》后，再次书写国家暴力、大屠杀。文在寅推荐！荣膺2023法国美第奇文学奖！",
                                "//img3m0.ddimg.cn/36/3/29642220-1_l_1700806112.jpg", "小说", 43.70);
                bookRepository.save(book57);
                Book book58 = new Book("驴皮记", "[法]巴尔扎克，果麦文化 出品", "9783959189521",
                                "驴皮记（巴尔扎克哲理小说代表作！也是作者的自传式小说，魔幻现实的故事写透了对欲望的求而不得。）",
                                "//img3m7.ddimg.cn/27/14/29655477-1_l_1702542508.jpg", "小说", 24.90);
                bookRepository.save(book58);
                Book book59 = new Book("阿西莫夫科幻短篇全集：最后的问题 刘慈欣xBBC纪录片推荐 阿西莫夫神就神在短篇，人类100年的进步追不上他10页想象！读客科幻文库",
                                "[美]艾萨克·阿西莫夫；读客文化 出品", "9789087226800",
                                "阿西莫夫科幻短篇全集：最后的问题 刘慈欣xBBC纪录片推荐 阿西莫夫神就神在短篇，人类100年的进步追不上他10页想象！读客科幻文库",
                                "//img3m4.ddimg.cn/41/28/29659154-1_l_1702983353.jpg", "小说", 77.30);
                bookRepository.save(book59);
                Book book60 = new Book("林海雪原(人民文学出版社）", "曲波", "9785364124975", "林海雪原(人民文学出版社）",
                                "//img3m1.ddimg.cn/16/34/29650021-1_l_1699427901.jpg", "小说", 75.80);
                bookRepository.save(book60);
                Book book61 = new Book("青春之歌", "杨沫", "9780755170876", "青春之歌（人民文学出版社）",
                                "//img3m4.ddimg.cn/19/0/29650024-1_l_1699427895.jpg", "小说", 83.20);
                bookRepository.save(book61);
                Book book62 = new Book("山乡巨变", "周立波", "9785103298745", "山乡巨变（人民文学出版社）",
                                "//img3m5.ddimg.cn/20/1/29650025-1_l_1699427899.jpg", "小说", 83.20);
                bookRepository.save(book62);
                Book book63 = new Book("水流云在 我的西南联大岁月", "汪曾祺", "9785820756054", "水流云在 我的西南联大岁月",
                                "//img3m7.ddimg.cn/22/3/29650027-1_l_1699426408.jpg", "小说", 49.30);
                bookRepository.save(book63);
                Book book64 = new Book("白夜", "（俄）陀思妥耶夫斯基 著     成时 译", "9782968006126", "白夜（陀思妥耶夫斯基著 彩色插图本）",
                                "//img3m6.ddimg.cn/78/33/29660676-1_l_1701674774.jpg", "小说", 30.80);
                bookRepository.save(book64);
                Book book65 = new Book("后来的金秀英", "[美]米娅·金，果麦文化  出品", "9783217176850", "后来的金秀英",
                                "//img3m4.ddimg.cn/86/4/29660684-1_l_1702373517.jpg", "小说", 37.30);
                bookRepository.save(book65);
                Book book66 = new Book("世界尽头的女友 第五届、第七届华文世界电影小说奖得主 温文锦短篇小说集 12个绮丽神秘的故事 12种幽微奇诡的感情 抚慰青春忧伤与青年苦闷", "温文锦",
                                "9786203560848",
                                "世界尽头的女友 第五届、第七届华文世界电影小说奖得主 温文锦短篇小说集 12个绮丽神秘的故事 12种幽微奇诡的感情 抚慰青春忧伤与青年苦闷",
                                "//img3m7.ddimg.cn/85/15/29664247-1_l_1702536616.jpg", "小说", 44.20);
                bookRepository.save(book66);
                Book book67 = new Book("山人鱼与乌有王", "山尾悠子 著，野望 出品", "9786076505403",
                                "山人鱼与乌有王（斩获日本幻想界三大奖，承继涩泽龙彦，超现实主义女王集大成新作，首版送精美明信片3张）",
                                "//img3m6.ddimg.cn/50/8/29657876-1_l_1702978930.jpg", "小说", 39.00);
                bookRepository.save(book67);
                Book book68 = new Book("莲花白", "宁不远", "9787561146101", "莲花白",
                                "//img3m3.ddimg.cn/88/5/29653063-1_l_1701936007.jpg", "小说", 28.50);
                bookRepository.save(book68);
                Book book69 = new Book("陌生人的日记", "[英]艾莉˙格里菲斯 著; 王冉  译;", "9781102108481",
                                "陌生人的日记（是谁，写了我的日记？三重叙述视角、一部哥特式“作中作”，串联多起谋杀）午夜文库",
                                "//img3m7.ddimg.cn/5/26/29658227-1_l_1701853548.jpg",
                                "小说", 49.30);
                bookRepository.save(book69);
                Book book70 = new Book("时光错动 “地狱笑话大师”冯内古特封笔作 准确预言自己死期。世界越荒唐，清醒的人笑得越荒凉。赠地狱笑话语录 读客彩条文库",
                                "[美]库尔特·冯内古特；读客文化 出品",
                                "9785070542704", "时光错动 “地狱笑话大师”冯内古特封笔作 准确预言自己死期。世界越荒唐，清醒的人笑得越荒凉。赠地狱笑话语录 读客彩条文库",
                                "//img3m9.ddimg.cn/24/36/29662899-1_l_1701846135.jpg", "小说", 29.95);
                bookRepository.save(book70);
                Book book71 = new Book("漫长的正义 愤怒于他人遭受的不公，就是在捍卫自己内心的正义！ 读客当代文学文库", "艾玛；读客文化 出品", "9784311353864",
                                "漫长的正义 愤怒于他人遭受的不公，就是在捍卫自己内心的正义！ 读客当代文学文库",
                                "//img3m6.ddimg.cn/12/22/29665956-1_l_1702453071.jpg", "小说",
                                24.95);
                bookRepository.save(book71);
                Book book72 = new Book("关于爱情", "（俄）安东·契诃夫 著,博集天卷 出品", "9784232809495", "关于爱情（突然间不由自主地，感受到心中有某种像是爱情的东西）",
                                "//img3m1.ddimg.cn/53/35/29657681-1_l_1703217351.jpg", "小说", 24.00);
                bookRepository.save(book72);
                Book book73 = new Book("保卫延安", "杜鹏程", "9780184642999", "保卫延安（人民文学出版社）",
                                "//img3m9.ddimg.cn/93/12/29649999-1_l_1699427908.jpg", "小说", 69.50);
                bookRepository.save(book73);
                Book book74 = new Book("莫斯科小猫", "[俄罗斯]格里高利·斯鲁日特尔  后浪", "9783138417728", "莫斯科小猫",
                                "//img3m7.ddimg.cn/85/21/29651377-1_l_1703066034.jpg", "小说", 55.90);
                bookRepository.save(book74);
                Book book75 = new Book("地上的天空", "钟求是  著 ，新经典  出品", "9782943224347",
                                "地上的天空（鲁迅文学奖得主钟求是最新中短篇小说集，人生九故事，程永新、徐则臣、班宇推荐）",
                                "//img3m8.ddimg.cn/19/30/29651608-1_l_1700464953.jpg",
                                "小说", 24.70);
                bookRepository.save(book75);
                Book book76 = new Book("雷锋的故事", "徐鲁 著，酷威文化 出品", "9785558918380", "雷锋的故事（经典爱国主义教育读本）",
                                "//img3m0.ddimg.cn/25/17/29656960-1_l_1701065918.jpg", "小说", 14.00);
                bookRepository.save(book76);
                Book book77 = new Book("生命式", "[日]村田沙耶香", "9780478820416", "生命式（签名版）",
                                "//img3m3.ddimg.cn/49/11/29659063-1_l_1701941670.jpg", "小说", 27.00);
                bookRepository.save(book77);
                Book book78 = new Book("未经删节", "[英] 戴安娜·阿西尔   后浪", "9785447181628", "未经删节",
                                "//img3m1.ddimg.cn/62/1/29659571-1_l_1702030317.jpg", "小说", 29.00);
                bookRepository.save(book78);
                Book book79 = new Book("镜子地狱", "【日】江户川乱步", "9786573027903", "镜子地狱",
                                "//img3m9.ddimg.cn/79/12/29661469-1_l_1702881715.jpg", "小说", 14.00);
                bookRepository.save(book79);
                Book book80 = new Book("人间好玩", "蔡澜 著,博集天卷 出品", "9789775830579", "人间好玩",
                                "//img3m9.ddimg.cn/55/30/29197729-1_l_1688454884.jpg", "文学", 24.00);
                bookRepository.save(book80);
                Book book81 = new Book("聆听父亲", "张大春  著 ，新经典  出品", "9782452935888", "聆听父亲（签章本）",
                                "//img3m0.ddimg.cn/64/15/29630170-1_l_1696992658.jpg", "文学", 32.40);
                bookRepository.save(book81);
                Book book82 = new Book("优雅转身", "晓雪 著", "9780215175854", "优雅转身",
                                "//img3m8.ddimg.cn/13/7/29628238-1_l_1696998702.jpg", "文学", 29.50);
                bookRepository.save(book82);
                Book book83 = new Book("沈从文：到日光下去生活", "沈从文", "9786462339155",
                                "沈从文：到日光下去生活（今天也要好好过。到日光下去，去找到你的甜。沈从文先生诞辰120周年全彩纪念版！一本书阅尽沈从文作品精华。汪曾祺、季羡林、贾平凹、曹文轩、董卿等极力推崇。）",
                                "//img3m2.ddimg.cn/39/13/29278002-1_l_27.jpg", "文学", 20.20);
                bookRepository.save(book83);
                Book book84 = new Book("自造", "陶勇 著,博集天卷 出品", "9784843914182", "自造（印签版和印章版随机发放，《目光》姊妹篇，陶勇医生暖心治愈之作！）",
                                "//img3m8.ddimg.cn/73/21/29336248-1_l_15.jpg", "文学", 29.00);
                bookRepository.save(book84);
                Book book85 = new Book("中国文学课", "陈思和 郜元宝 张新颖 等", "9785189603419",
                                "中国文学课（上下册）独家签名版（余秋雨、韩寒、张大春重磅推荐，付费课程收听超1500万人次）",
                                "//img3m2.ddimg.cn/18/16/28995732-1_l_10.jpg", "文学",
                                92.10);
                bookRepository.save(book85);
                Book book86 = new Book("丰子恺万般滋味，都是生活", "丰子恺", "9785500152657", "丰子恺万般滋味，都是生活",
                                "//img3m5.ddimg.cn/31/23/25308985-1_l_1699941964.jpg", "文学", 21.00);
                bookRepository.save(book86);
                Book book87 = new Book("不止读书", "魏小河", "9784549576257", "不止读书（独家签名本！像魏小河一样读书，温柔地走进文学的河流）",
                                "//img3m4.ddimg.cn/16/4/29351734-1_l_1693363061.jpg", "文学", 43.50);
                bookRepository.save(book87);
                Book book88 = new Book("我从未像那样爱过一个人", "(西) 路易斯·拉米罗著;锐拓译", "9786349106689", "我从未像那样爱过一个人",
                                "//img3m3.ddimg.cn/17/27/29643983-1_l_1701839991.jpg", "文学", 24.90);
                bookRepository.save(book88);
                Book book89 = new Book("钱锺书的围城", "栾贵明 著", "9782105002820", "钱锺书的围城",
                                "//img3m9.ddimg.cn/56/3/29610659-1_l_1698720598.jpg", "文学", 24.00);
                bookRepository.save(book89);
                Book book90 = new Book("晴耕雨读，得闲饮茶", "季羡林 汪曾祺 梁实秋等", "9782161038603", "晴耕雨读，得闲饮茶",
                                "//img3m7.ddimg.cn/50/29/29546897-1_l_1695630025.jpg", "文学", 24.90);
                bookRepository.save(book90);
                Book book91 = new Book("屠海", "（加）法利·莫厄特", "9784694416255", "屠海",
                                "//img3m2.ddimg.cn/91/27/29552482-1_l_3.jpg",
                                "文学", 73.50);
                bookRepository.save(book91);
                Book book92 = new Book("灵光集：兰波诗歌集注(当当网定制)", "[法]阿蒂尔·兰波 著，何家炜 译", "9789452079277", "灵光集：兰波诗歌集注(当当网定制)",
                                "//img3m8.ddimg.cn/70/3/29133988-1_l_3.jpg", "文学", 34.90);
                bookRepository.save(book92);
                Book book93 = new Book("六神磊磊读金庸(金庸之子查传倜先", "六神磊磊，果麦文化 出品", "9784379385296",
                                "六神磊磊读金庸(金庸之子查传倜先生诚挚推荐   读金庸觉得江湖远，看六神磊磊才知何处不江湖)",
                                "//img3m7.ddimg.cn/46/18/29292067-1_l_19.jpg", "文学",
                                34.00);
                bookRepository.save(book93);
                Book book94 = new Book("人生如逆旅，幸好还有苏轼(人文艺", "为你读诗 湘人彭二 符殊 朱卫东 著,博集天卷 出品", "9781126620495",
                                "人生如逆旅，幸好还有苏轼(人文艺术品牌“为你读诗”荣耀大作，全民偶像苏东坡给不安的你八个锦囊,教你直面人生逆旅)",
                                "//img3m1.ddimg.cn/54/2/29350881-1_l_10.jpg", "文学", 29.90);
                bookRepository.save(book94);
                Book book95 = new Book("依然热爱生活", "凉子访谈录 著,博集天卷 出品", "9783691037456",
                                "依然热爱生活（现象级访谈类节目《凉子访谈录》亮相文坛之作，黄灯以爱之名作序，梁鸿、史航诚意推荐）",
                                "//img3m9.ddimg.cn/74/22/29336249-1_l_6.jpg", "文学",
                                24.90);
                bookRepository.save(book95);
                Book book96 = new Book("她们和她们", "安小庆、林松果、李斐然/著", "9784899794813", "她们和她们",
                                "//img3m3.ddimg.cn/81/11/29444463-1_l_11.jpg", "文学", 28.00);
                bookRepository.save(book96);
                Book book97 = new Book("吞噬黑暗的人", "英）理查德·劳埃德·帕里 著，汉唐阳光 出品， 尹楠 译", "9784641918368", "吞噬黑暗的人",
                                "//img3m0.ddimg.cn/25/9/29515390-1_l_3.jpg", "文学", 49.00);
                bookRepository.save(book97);
                Book book98 = new Book("茅盾讲中国神话", "茅盾  著；飞白，顾青峰 绘", "9787449410638",
                                "茅盾讲中国神话（当当专享版特别赠送藏书票+吉祥海报；茅盾先生研究力作；百万人气插画师飞白、顾青峰联手演绎中国神话之美）",
                                "//img3m7.ddimg.cn/9/12/29337867-1_l_11.jpg", "文学", 38.40);
                bookRepository.save(book98);
                Book book99 = new Book("丰子恺艺术启蒙：写给孩子的美术与", "丰子恺", "9787690296821", "丰子恺艺术启蒙：写给孩子的美术与音乐故事",
                                "//img3m9.ddimg.cn/80/29/29442779-1_l_1699430754.jpg", "文学", 24.90);
                bookRepository.save(book99);
                Book book100 = new Book("忽有山河大地", "胡烟  著", "9784226072836", "忽有山河大地",
                                "//img3m0.ddimg.cn/68/20/29348420-1_l_6.jpg", "文学", 38.60);
                bookRepository.save(book100);
                Book book101 = new Book("弃猫 当我谈起父亲时", "村上春树 著，磨铁图书 出品", "9789840811557", "弃猫 当我谈起父亲时（村上春树2021重磅新作）",
                                "//img3m9.ddimg.cn/41/12/29174549-1_l_12.jpg", "文学", 38.00);
                bookRepository.save(book101);
                Book book102 = new Book("大地仍躲在棉被下越冬", "(俄罗斯) 弗拉基米尔?伊万诺维奇?科利别里", "9783105948163", "大地仍躲在棉被下越冬",
                                "//img3m5.ddimg.cn/71/2/29316545-1_l_6.jpg", "文学", 39.00);
                bookRepository.save(book102);
                Book book103 = new Book("于谦：人间可爱", "于谦 著,博集天卷 出品", "9780032814073", "于谦：人间可爱",
                                "//img3m4.ddimg.cn/73/19/29335654-1_l_7.jpg", "文学", 29.90);
                bookRepository.save(book103);
                Book book104 = new Book("N号房追踪记", "追踪团火花 著,博集天卷 出品", "9788796035130", "N号房追踪记（震惊全球的网络性犯罪，韩国N号房事件直击实录）",
                                "//img3m1.ddimg.cn/38/14/29359181-1_l_2.jpg", "文学", 29.90);
                bookRepository.save(book104);
                Book book105 = new Book("海子·诗", "海子", "9786879317753", "海子·诗",
                                "//img3m0.ddimg.cn/88/35/26911060-1_l_4.jpg",
                                "文学", 40.00);
                bookRepository.save(book105);
                Book book106 = new Book("白色记事簿2", "陈拙 著,博集天卷 出品", "9785714441097",
                                "白色记事簿2（当当专享签名版+口罩，“魔宙”旗下非虚构品牌“天才捕手计划”重磅作品，“医院奇闻录”纪实系列，引发无数粉丝共鸣的高口碑之作）",
                                "//img3m9.ddimg.cn/10/2/29356579-1_l_1690187694.jpg", "文学", 28.00);
                bookRepository.save(book106);
                Book book107 = new Book("搬山寄：张二棍诗集", "张二棍", "9781082282133",
                                "搬山寄：张二棍诗集（因为苍天在上，我愿埋首人间。地质钻工的生命之诗，献给每一个负重前行的人）",
                                "//img3m9.ddimg.cn/51/11/29350779-1_l_9.jpg", "文学", 41.00);
                bookRepository.save(book107);
                Book book108 = new Book("余秀华作品3册精选套装", "余秀华  著 ， 新经典  出品", "9781647522360",
                                "余秀华作品3册精选套装（月光落在左手上+我们爱过又忘记+无端欢喜）",
                                "//img3m2.ddimg.cn/51/21/29137632-1_l_5.jpg", "文学", 45.00);
                bookRepository.save(book108);
                Book book109 = new Book("两个夏天", "（日）谷川俊太郎、（日）佐野洋子  时代华语 出品", "9780036794548",
                                "两个夏天（谷川俊太郎×佐野洋子：我爱你，与时间无关！）",
                                "//img3m3.ddimg.cn/28/20/29327293-1_l_13.jpg", "文学", 36.20);
                bookRepository.save(book109);
                Book book110 = new Book("惶然录", "【葡】费尔南多·佩索阿 韩少功 译", "9788759481974", "惶然录",
                                "//img3m1.ddimg.cn/97/0/29352211-1_l_12.jpg", "文学", 51.00);
                bookRepository.save(book110);
                Book book111 = new Book("不可征服:中国姑娘徒步南极难抵极", "冯静 著", "9783220381289", "不可征服:中国姑娘徒步南极难抵极纪实",
                                "//img3m9.ddimg.cn/37/14/29337499-1_l_9.jpg", "文学", 39.50);
                bookRepository.save(book111);
                Book book112 = new Book("秋素春秾", "王路", "9787741074590", "秋素春秾",
                                "//img3m0.ddimg.cn/96/22/29406660-1_l_13.jpg",
                                "文学", 48.00);
                bookRepository.save(book112);
                Book book113 = new Book("我爱这哭不出来的浪漫", "严明  著 ，新经典  出品", "9788281635975", "我爱这哭不出来的浪漫（当当专享签名本）",
                                "//img3m6.ddimg.cn/36/16/29334726-1_l_4.jpg", "文学", 37.40);
                bookRepository.save(book113);
                Book book114 = new Book("人间小满", "姑苏阿焦 著，文通天下 出品", "9785696967387", "人间小满",
                                "//img3m6.ddimg.cn/64/33/29452366-1_l_1694398492.jpg", "文学", 18.40);
                bookRepository.save(book114);
                Book book115 = new Book("心的千问", "庆山，果麦文化 出品", "9787688000072",
                                "心的千问（庆山与读者的一千个问答。直到道理变成真正的经验。“每个问题都有共鸣，每个回答都有受益。这些问答是心的镇定剂。”）",
                                "//img3m9.ddimg.cn/14/26/29259959-1_l_12.jpg", "文学", 34.00);
                bookRepository.save(book115);
                Book book116 = new Book("北纬四十度", "陈福民", "9781269497572",
                                "北纬四十度（月度“中国好书”，2021收获文学榜长篇非虚构榜首，解密盘旋千年的历史愁云，绘制一幅雄浑的千古江山图）",
                                "//img3m0.ddimg.cn/73/33/29288530-1_l_17.jpg", "文学", 53.80);
                bookRepository.save(book116);
                Book book117 = new Book("活着就是冲天一喊", "陈年喜 著，真故图书 出品", "9789861697680",
                                "活着就是冲天一喊（哈佛大学邀请演讲，《纽约时报》《人民日报》报道的矿工诗人陈年喜SHOU部散文集。赠作者蕞新诗集。）",
                                "//img3m1.ddimg.cn/33/16/29258691-1_l_64.jpg", "文学", 28.00);
                bookRepository.save(book117);
                Book book118 = new Book("人生忽然", "韩少功", "9788289554025", "人生忽然（韩少功）",
                                "//img3m1.ddimg.cn/33/1/29309181-1_l_11.jpg", "文学", 29.50);
                bookRepository.save(book118);
                Book book119 = new Book("这一生关于你的风景：11位独立女性", "李梦霁 著；星文文化 出品", "9785321792537", "这一生关于你的风景：11位独立女性的绚丽人生",
                                "//img3m1.ddimg.cn/63/16/29323071-1_l_8.jpg", "文学", 19.90);
                bookRepository.save(book119);
                Book book120 = new Book("佐野洋子作品集", "[日]佐野洋子 著，马文赫  吕灵芝  清泉浅井 鲁莎 译，未读 出品", "9786517696707",
                                "佐野洋子作品集（全4册）",
                                "//img3m6.ddimg.cn/17/6/29271446-1_l_17.jpg", "文学", 100.00);
                bookRepository.save(book120);
                Book book121 = new Book("哈佛新编中国现代文学史", "王德威 主编，理想国 出品", "9784841319040", "哈佛新编中国现代文学史",
                                "//img3m9.ddimg.cn/93/18/29417349-1_l_14.jpg", "文学", 193.50);
                bookRepository.save(book121);
                Book book122 = new Book("半小时漫画古诗词系列全集", "陈磊.半小时漫画团队 著；读客文化 出品", "9788647573392",
                                "半小时漫画古诗词系列全集（全5册）（读完这些爆笑的古诗漫画，孩子多半会主动背古诗！专享赠送诗人知识卡！混子哥陈磊新作！）",
                                "//img3m4.ddimg.cn/13/22/29218774-1_l_20.jpg", "文学", 129.70);
                bookRepository.save(book122);
                Book book123 = new Book("大地五部曲", "罗长江 著，微言文化出品，有容书邦 发行", "9789687455686",
                                "大地五部曲（全5册，回望历史，体察当下，叩问未来。书写中国大地的宏大史诗。谢冕、秦兆基、邹岳汉、王志清、龚旭东作序推荐。）",
                                "//img3m1.ddimg.cn/87/7/29346261-1_l_11.jpg", "文学", 358.20);
                bookRepository.save(book123);
                Book book124 = new Book("纳博科夫文学讲稿三种", "[美]弗拉基米尔·纳博科夫 著 申慧辉等 译", "9786279265203", "纳博科夫文学讲稿三种（套装）",
                                "//img3m6.ddimg.cn/97/3/29345776-1_l_4.jpg", "文学", 231.30);
                bookRepository.save(book124);
                Book book125 = new Book("枕上诗书系列  全4册套装", "徐若央，蓝风，赵小峦, 方慧颖", "9786332200295",
                                "枕上诗书系列  全4册套装（读ZUI美的诗，品ZUI深情的词，做更好的自己）", "//img3m8.ddimg.cn/25/32/28492918-1_l_16.jpg",
                                "文学", 52.70);
                bookRepository.save(book125);
                Book book126 = new Book("大家小书-典藏版4", "吕叔湘、么书仪等", "9780091185442", "大家小书-典藏版4（精装）【箱装】",
                                "//img3m0.ddimg.cn/48/11/29318700-1_l_3.jpg", "文学", 1142.4);
                bookRepository.save(book126);
                Book book127 = new Book("巴尔扎克全集", "（法）巴尔扎克", "9786721054522", "巴尔扎克全集（30卷）",
                                "//img3m8.ddimg.cn/29/8/27949808-1_l_2.jpg", "文学", 2354.2);
                bookRepository.save(book127);
                Book book128 = new Book("清冽的内在", "庆山", "9785319505460",
                                "清冽的内在（庆山最新作品，庆山安妮宝贝2023全新图文集，当当专享作家肖像签名胶片书签+印章版）",
                                "//img3m7.ddimg.cn/24/4/29668047-1_l_1703116911.jpg", "文学", 69.00);
                bookRepository.save(book128);
                Book book129 = new Book("心有花田万事香", "姑苏阿焦 著,博集天卷 出品", "9784471863098",
                                "心有花田万事香（当当专享亲签版，《人间小满》大热后姑苏阿焦全新漫画随笔，写给你我的人生态度之书！）",
                                "//img3m5.ddimg.cn/82/21/29652265-1_l_1700794074.jpg", "文学", 24.90);
                bookRepository.save(book129);
                Book book130 = new Book("三大队：深蓝的故事精选集", "深蓝 著", "9788501659088", "三大队：深蓝的故事精选集（《三大队》张译主演电影及秦昊主演电视剧原著）",
                                "//img3m2.ddimg.cn/22/29/29661412-1_l_1702886410.jpg", "文学", 35.00);
                bookRepository.save(book130);
                Book book131 = new Book("当呼吸化为空气", "保罗·卡拉尼什  著，磨铁文化 出品", "9785154081143",
                                "当呼吸化为空气（修订版）（当当专享精美藏书票1张）比尔·盖茨写长评推荐！不要等到生命尽头，才开始做那些真正重要之事",
                                "//img3m6.ddimg.cn/74/18/29646416-1_l_1702880094.jpg", "文学", 24.90);
                bookRepository.save(book131);
                Book book132 = new Book("三大队：深蓝的故事精选集", "深蓝 著;", "9789527032398",
                                "三大队：深蓝的故事精选集（当当专享作者亲签+《三大队》电影官方授权电影票根）",
                                "//img3m1.ddimg.cn/42/0/29661531-1_l_1702886407.jpg", "文学", 38.00);
                bookRepository.save(book132);
                Book book133 = new Book("谁当凌绝顶，杜甫与我", "为你读诗 湘人彭二 符殊 朱卫东 著,博集天卷 出品", "9782418570412",
                                "谁当凌绝顶，杜甫与我（《人生如逆旅，幸好还有苏轼》原班人马再聚首打造杜甫之书！）",
                                "//img3m7.ddimg.cn/80/22/29656817-1_l_1702617231.jpg", "文学",
                                29.90);
                bookRepository.save(book133);
                Book book134 = new Book("一只山雀总会懂另一只山雀", "申赋渔  著 ，新经典  出品", "9780782936452",
                                "一只山雀总会懂另一只山雀（当当专享亲签版。回归乡间故里，不再追赶时间。静静的土地将挽救灰心、绝望和深深的厌倦）",
                                "//img3m5.ddimg.cn/42/21/29664105-1_l_1702957830.jpg", "文学", 32.40);
                bookRepository.save(book134);
                Book book135 = new Book("大宋词坛", "杨雨", "9786844032292", "大宋词坛（杨雨著）（亲签版）",
                                "//img3m1.ddimg.cn/71/4/29661461-1_l_1701846027.jpg", "文学", 31.90);
                bookRepository.save(book135);
                Book book136 = new Book("“日月同辉”套装", "为你读诗 湘人彭二 朱卫东 符殊 著,博集天卷 出品", "9785165717192",
                                "“日月同辉”套装（谁当凌绝顶，杜甫与我+你当像李白长风破浪）", "//img3m3.ddimg.cn/61/17/29657293-1_l_1703559179.jpg",
                                "文学", 59.80);
                bookRepository.save(book136);
                Book book137 = new Book("黄灿然的诗", "黄灿然", "9788158516789", "黄灿然的诗（蓝星诗库 典藏版）",
                                "//img3m9.ddimg.cn/12/27/29652789-1_l_1700029211.jpg", "文学", 54.50);
                bookRepository.save(book137);
                Book book138 = new Book("一场秋风老少年", "高建群", "9782529217886", "一场秋风老少年",
                                "//img3m8.ddimg.cn/68/1/29661458-1_l_1702881717.jpg", "文学", 44.90);
                bookRepository.save(book138);
                Book book139 = new Book("追梦珊瑚 献给为保护珊瑚而奋斗的科学家", "刘先平/著", "9785262393978", "追梦珊瑚 献给为保护珊瑚而奋斗的科学家",
                                "//img3m2.ddimg.cn/91/0/29665342-1_l_1702364428.jpg", "文学", 52.10);
                bookRepository.save(book139);
                Book book140 = new Book("多维的回响：东西作品评论集", "张清华等 著", "9784736070377",
                                "多维的回响：东西作品评论集（新晋茅盾文学奖获得者东西作品评论集萃，一本书带你读懂东西的文学世界）",
                                "//img3m0.ddimg.cn/56/16/29651150-1_l_1700712480.jpg", "文学", 56.70);
                bookRepository.save(book140);
                Book book141 = new Book("我认识一些深情的人", "曹可凡，果麦文化 出品", "9781149826775", "我认识一些深情的人（2023）",
                                "//img3m9.ddimg.cn/29/16/29655479-1_l_1700712623.jpg", "文学", 29.90);
                bookRepository.save(book141);
                Book book142 = new Book("“梁晓声谈中国”系列：梁晓声谈中国人", "梁晓声", "9787411152863", "“梁晓声谈中国”系列：梁晓声谈中国人",
                                "//img3m1.ddimg.cn/97/4/29661091-1_l_1701938022.jpg", "文学", 42.40);
                bookRepository.save(book142);
                Book book143 = new Book("小山词：婉约词经典之作，彩色插图精装版，随书附赠《词谱》", "晏几道", "9785258369482",
                                "小山词：婉约词经典之作，彩色插图精装版，随书附赠《词谱》",
                                "//img3m2.ddimg.cn/79/30/29663152-1_l_1702954182.jpg", "文学", 34.00);
                bookRepository.save(book143);
                Book book144 = new Book("斗横西北", "沙莎", "9788813022891", "斗横西北",
                                "//img3m1.ddimg.cn/8/2/29650211-1_l_1700532852.jpg", "文学", 34.00);
                bookRepository.save(book144);
                Book book145 = new Book("费秉勋古典审美三部：中国古典文学的悲与美", "费秉勋", "9782913149427", "费秉勋古典审美三部：中国古典文学的悲与美",
                                "//img3m5.ddimg.cn/12/6/29650215-1_l_1701678107.jpg", "文学", 33.00);
                bookRepository.save(book145);
                Book book146 = new Book("不焦虑的活法【印章版】", "正见 著，欣梦享 出品", "9786886141501",
                                "不焦虑的活法【印章版】（抖音知名传统文化博主、孟子第七十三代孙正见，写给现代人的生活哲思书。）",
                                "//img3m7.ddimg.cn/6/14/29654367-1_l_1700459652.jpg",
                                "文学", 27.40);
                bookRepository.save(book146);
                Book book147 = new Book("钱文忠解读三字经中", "钱文忠 著  时代华语 出品", "9783511134631",
                                "钱文忠解读三字经中（《百家讲坛》名师钱文忠力作，给孩子的国学启蒙，带孩子梳理中国传统文化知识框架与历史脉络）",
                                "//img3m5.ddimg.cn/57/21/29659665-1_l_1701312252.jpg", "文学", 29.90);
                bookRepository.save(book147);
                Book book148 = new Book("徒然草", "[日]吉田兼好 著 ，王以铸 译", "9787367898327", "徒然草",
                                "//img3m2.ddimg.cn/17/28/29658932-1_l_1703492313.jpg", "文学", 81.10);
                bookRepository.save(book148);
                Book book149 = new Book("生活在临终医院：最后的光阴", "薛舒", "9789602820544",
                                "生活在临终医院：最后的光阴（她们壮阔的嗓门，她们劳作的身影，她们热火朝天地生活在这里。）",
                                "//img3m7.ddimg.cn/61/11/29662837-1_l_1701917905.jpg", "文学", 48.70);
                bookRepository.save(book149);
                Book book150 = new Book("尚未完成的历史： 从《子夜》到《白鹿原》的中国新文学之变", "张宇奇 著", "9786736538932",
                                "尚未完成的历史： 从《子夜》到《白鹿原》的中国新文学之变", "//img3m5.ddimg.cn/68/33/29637995-1_l_1700722080.jpg",
                                "文学", 24.00);
                bookRepository.save(book150);
                Book book151 = new Book("你是那人间的四月天", "林徽因  著，磨铁文化 出品", "9782692599833",
                                "你是那人间的四月天（全新精装珍藏版！民国才女林徽因传世绝作）",
                                "//img3m3.ddimg.cn/9/31/29640213-1_l_1700477895.jpg", "文学", 23.00);
                bookRepository.save(book151);
                Book book152 = new Book("朝花夕拾 野草", "鲁迅", "9784698446487",
                                "朝花夕拾 野草（鲁迅作品：他和他的觉醒年代）精选条目，精加注释。称手小开本，柔软易携带。纯木浆内文纸印刷。",
                                "//img3m7.ddimg.cn/25/20/29665177-1_l_1703125695.jpg", "文学", 22.90);
                bookRepository.save(book152);
                Book book153 = new Book("故事会校园版合订本. 第32辑", "《故事会》编辑部", "9788677888572", "故事会校园版合订本. 第32辑",
                                "//img3m6.ddimg.cn/75/31/29668296-1_l_1703038922.jpg", "文学", 18.70);
                bookRepository.save(book153);
                Book book154 = new Book("秋雨散文五十篇", "余秋雨", "9788222840505", "秋雨散文五十篇（精装）诚恳直白的质朴叙事 叩问本真的天地诗情",
                                "//img3m1.ddimg.cn/19/13/29661211-1_l_1703038911.jpg", "文学", 73.50);
                bookRepository.save(book154);
                Book book155 = new Book("守夜人丨中国文坛杰出诗人余光中，生涯wei一中英双语选集，一座与永恒拔河的诗情王国，字字句句惊心动魄", "余光中", "9785676732523",
                                "守夜人丨中国文坛杰出诗人余光中，生涯wei一中英双语选集，一座与永恒拔河的诗情王国，字字句句惊心动魄",
                                "//img3m1.ddimg.cn/56/11/29656991-1_l_1701412345.jpg", "文学", 59.50);
                bookRepository.save(book155);
                Book book156 = new Book("人间送小温：汪曾祺散文精选纪念版", "汪曾祺 著   凤凰含章出品", "9788650038079", "人间送小温：汪曾祺散文精选纪念版",
                                "//img3m2.ddimg.cn/27/21/29664882-1_l_1703131576.jpg", "文学", 27.40);
                bookRepository.save(book156);
                Book book157 = new Book("世间欢喜消遣人：朱光潜全新散文选集", "朱光潜 著   凤凰含章出品", "9788825805390", "世间欢喜消遣人：朱光潜全新散文选集",
                                "//img3m5.ddimg.cn/30/24/29664885-1_l_1703137460.jpg", "文学", 27.40);
                bookRepository.save(book157);
                Book book158 = new Book("除了爱你，我没有别的愿望 ", "沈从文 著   凤凰含章出品", "9786464226415", "除了爱你，我没有别的愿望 （彩插精装收藏版）",
                                "//img3m3.ddimg.cn/48/5/29664903-1_l_1703131564.jpg", "文学", 27.40);
                bookRepository.save(book158);
                Book book159 = new Book("看清生活的真相之后，依然热爱生活：梁实秋经典珍藏版", "梁实秋 著   凤凰含章出品", "9784804139463",
                                "看清生活的真相之后，依然热爱生活：梁实秋经典珍藏版", "//img3m8.ddimg.cn/53/10/29664908-1_l_1703137456.jpg",
                                "文学", 27.40);
                bookRepository.save(book159);
                Book book160 = new Book("坤宁终章", "时镜 著，酷威文化 出品", "9781943902323", "坤宁终章（共2册）白鹿、张凌赫主演电视剧《宁安如梦》原著小说",
                                "//img3m8.ddimg.cn/69/34/29286348-1_l_6.jpg", "青春文学", 44.00);
                bookRepository.save(book160);
                Book book161 = new Book("天官赐福：全三册【印特签版】(五", "墨香铜臭 著，磨铁文化 出品", "9786783371667",
                                "天官赐福：全三册【印特签版】(五层瓦楞纸加厚纸箱（外包装）+5丝气柱袋（内包装）+葫芦膜填充，三重保护包装)",
                                "//img3m2.ddimg.cn/60/31/29570172-1_l_1697848491.jpg", "青春文学", 199.00);
                bookRepository.save(book161);
                Book book162 = new Book("如此尔尔", "风流书呆 著，酷威文化 出品", "9787759147750",
                                "如此尔尔（全二册）【亲签版+当当定制大婚海报】风流书呆著网络原名：爱谁谁",
                                "//img3m9.ddimg.cn/64/9/29654029-1_l_1700197185.jpg", "青春文学", 49.80);
                bookRepository.save(book162);
                Book book163 = new Book("和离", "九鹭非香 著,博集天卷 出品", "9781239516852", "和离（当当亲签版，人气玄幻作家九鹭非香甜虐交织的救赎之作）",
                                "//img3m5.ddimg.cn/53/17/29652335-1_l_1701936145.jpg", "青春文学", 29.00);
                bookRepository.save(book163);
                Book book164 = new Book("这么多年 ", "八月长安", "9780247309852", "这么多年 （全3册）",
                                "//img3m9.ddimg.cn/6/36/29279949-1_l_30.jpg", "青春文学", 64.00);
                bookRepository.save(book164);
                Book book165 = new Book("偷偷藏不住", "竹已 著,  悦读纪 出品", "9787705269932",
                                "偷偷藏不住（全二册） 晋江金榜  赵露思、陈哲远 主演 影视原著 桑稚VS段嘉许 言情大神竹已难哄奶油味暗恋",
                                "//img3m6.ddimg.cn/25/7/28525786-1_l_7.jpg",
                                "青春文学", 32.80);
                bookRepository.save(book165);
                Book book166 = new Book("全球高考收藏版礼盒", "木苏里", "9784344059016", "全球高考收藏版礼盒（未披露番外+无限流幻想小说力作）随书附藏书票等八款赠品",
                                "//img3m9.ddimg.cn/19/33/29176309-1_l_17.jpg", "青春文学", 125.00);
                bookRepository.save(book166);
                Book book167 = new Book("甜妻", "咬春饼   记忆坊出品    有容书邦发行", "9784356019251",
                                "甜妻（全二册）（咬春饼 甜宠爱情故事，他的乔姑娘（原名《悍夫》姊妹篇）",
                                "//img3m8.ddimg.cn/0/22/26446068-1_l_18.jpg", "青春文学", 29.00);
                bookRepository.save(book167);
                Book book168 = new Book("偏偏宠爱", "藤萝为枝 著,  悦读纪 出品", "9780190408930", "偏偏宠爱",
                                "//img3m1.ddimg.cn/86/23/28523471-1_l_6.jpg", "青春文学", 32.80);
                bookRepository.save(book168);
                Book book169 = new Book("奶油味暗恋", "竹已 著,  悦读纪 出品", "9788046648578",
                                "奶油味暗恋（上下册）（《全世界最好的你》电视剧原著小说。宋伊人、张耀领衔主演）",
                                "//img3m0.ddimg.cn/18/31/26183340-1_l_2.jpg", "青春文学", 43.50);
                bookRepository.save(book169);
                Book book170 = new Book("我喜欢你，像风走了八千里", "末那大叔 著，磨铁文化 出品", "9785454407582", "我喜欢你，像风走了八千里（随机签名版）",
                                "//img3m1.ddimg.cn/16/1/26515681-1_l_19.jpg", "青春文学", 37.50);
                bookRepository.save(book170);
                Book book171 = new Book("败给喜欢", "竹已 著,  悦读纪 出品", "9784239881241", "败给喜欢（共2册）",
                                "//img3m8.ddimg.cn/63/5/28469988-1_l_5.jpg", "青春文学", 47.30);
                bookRepository.save(book171);
                Book book172 = new Book("将进酒终章", "唐酒卿 著，酷威文化 出品", "9788960158993", "将进酒终章（共2册）【印特签版+定制专属印签海报+头像贴纸】唐酒卿",
                                "//img3m4.ddimg.cn/61/31/29518594-1_l_1.jpg", "青春文学", 49.80);
                bookRepository.save(book172);
                Book book173 = new Book("朝俞", "木瓜黄；力潮文创", "9785148125747", "朝俞（全2册） 限定正面白版护封+背面黑版护封套装 原名伪装学渣 青春畅销小说实体书",
                                "//img3m9.ddimg.cn/16/20/29579929-1_l_2.jpg", "青春文学", 43.80);
                bookRepository.save(book173);
                Book book174 = new Book("轻狂3完结篇", "巫哲", "9784712091075", "轻狂3完结篇（“轻狂”系列大结局来袭！作家巫哲热血校园文！新增出版番外！）",
                                "//img3m0.ddimg.cn/23/31/29258780-1_l_3.jpg", "青春文学", 24.90);
                bookRepository.save(book174);
                Book book175 = new Book("一级律师3 晋江人气作家木苏里高口", "木苏里", "9784572118318",
                                "一级律师3 晋江人气作家木苏里高口碑之作 星际律师当坚持初心，不惧黑暗，只为正义不朽 千寻文化",
                                "//img3m4.ddimg.cn/85/14/29143804-1_l_6.jpg", "青春文学",
                                30.10);
                bookRepository.save(book175);
                Book book176 = new Book("有匪全集", "Priest 著，博集天卷 出品", "9789586120227",
                                "有匪全集（赵丽颖、王一博主演《有翡》原著小说。Priest扛鼎之作，全4册）",
                                "//img3m7.ddimg.cn/81/24/25166277-1_l_25.jpg", "青春文学", 70.00);
                bookRepository.save(book176);
                Book book177 = new Book("赘婿1-5", "愤怒的香蕉 著,  悦读纪 出品", "9783560985161",
                                "赘婿1-5（共五册）郭麒麟、宋轶主演电视剧《赘婿》同名原著小说，《卿卿日常》主创团队 ；与《庆余年》《雪中悍刀行》齐名之作",
                                "//img3m6.ddimg.cn/39/4/29198406-1_l_20.jpg", "青春文学", 99.50);
                bookRepository.save(book177);
                Book book178 = new Book("顾漫：你是我的荣耀【赠海报+明信", "顾漫  著， 华文天下  出品", "9786031915940",
                                "顾漫：你是我的荣耀【赠海报+明信片2张】 杨洋、迪丽热巴主演原著，签名本随机掉落",
                                "//img3m4.ddimg.cn/94/0/27869584-1_l_14.jpg", "青春文学",
                                18.00);
                bookRepository.save(book178);
                Book book179 = new Book("一生一世美人骨", "墨宝非宝 著，磨铁文化 出品", "9789921454536",
                                "一生一世美人骨（任嘉伦、白鹿主演《一生一世》《周生如故》原著小说）",
                                "//img3m6.ddimg.cn/54/13/28497006-1_l_4.jpg", "青春文学", 37.00);
                bookRepository.save(book179);
                Book book180 = new Book("他的乔姑娘", "咬春饼著，记忆坊出品，有容书邦 发行", "9783657254217", "他的乔姑娘（原名《悍夫》，《甜妻》姊妹篇）",
                                "//img3m0.ddimg.cn/43/14/25266130-1_l_20.jpg", "青春文学", 28.00);
                bookRepository.save(book180);
                Book book181 = new Book("草莓印", "不止是颗菜  白马时光出品", "9788940640227", "草莓印（全文修订、随书附含番外+、精美“草莓时光”明信片！）",
                                "//img3m7.ddimg.cn/71/35/27923417-1_l_11.jpg", "青春文学", 34.00);
                bookRepository.save(book181);
                Book book182 = new Book("等风轻抚你", "唧唧的猫 著,  悦读纪 出品", "9788671750103", "等风轻抚你（全二册）（网络原名《等风热吻你》）",
                                "//img3m2.ddimg.cn/80/20/28971242-1_l_3.jpg", "青春文学", 47.30);
                bookRepository.save(book182);
                Book book183 = new Book("可爱多少钱一斤", "栖见 著,  悦读纪 出品", "9788439677789", "可爱多少钱一斤（共2册）",
                                "//img3m1.ddimg.cn/80/29/25574651-1_l_4.jpg", "青春文学", 24.70);
                bookRepository.save(book183);
                Book book184 = new Book("可爱过敏原：全2册", "稚楚 著,博集天卷 出品", "9783716052389",
                                "可爱过敏原：全2册（人气作家稚楚温馨之作。随书附赠多重主题赠品）",
                                "//img3m6.ddimg.cn/5/16/29629616-1_l_1695865166.jpg", "青春文学", 74.20);
                bookRepository.save(book184);
                Book book185 = new Book("七根凶简.全4册", "尾鱼 著，磨铁文化 出品", "9786187165367", "七根凶简.全4册（新版）（当当专供）",
                                "//img3m2.ddimg.cn/95/36/29652872-1_l_1700094644.jpg", "青春文学", 143.40);
                bookRepository.save(book185);
                Book book186 = new Book("救赎剧本 上卷", "从温", "9786357023671", "救赎剧本 上卷（亲签版，加赠当当专属赠品“漫画拉页”X1）晋江金榜作者从温成名作",
                                "//img3m0.ddimg.cn/78/23/29650380-1_l_1699441002.jpg", "青春文学", 30.40);
                bookRepository.save(book186);
                Book book187 = new Book("庆余年·朝天子(陈道明、张若昀等主演电视剧原著小说，修订版第十四卷）", "猫腻", "9788568781425",
                                "庆余年·朝天子(陈道明、张若昀等主演电视剧原著小说，修订版第十四卷）",
                                "//img3m6.ddimg.cn/66/25/29654526-1_l_1700532865.jpg", "青春文学",
                                35.50);
                bookRepository.save(book187);
                Book book188 = new Book("渡厄【特签版+当当定制信纸x2】杨溯", "杨溯 著，酷威文化 出品", "9789399437710", "渡厄【特签版+当当定制信纸x2】杨溯",
                                "//img3m7.ddimg.cn/98/9/29658617-1_l_1701242609.jpg", "青春文学", 38.80);
                bookRepository.save(book188);
                Book book189 = new Book("过秋天", "木甜，大鱼文化", "9781078279819", "过秋天",
                                "//img3m3.ddimg.cn/36/31/29646873-1_l_1699243550.jpg", "青春文学", 23.50);
                bookRepository.save(book189);
                Book book190 = new Book("七根凶简.2", "尾鱼 著，磨铁文化 出品", "9788574727455", "七根凶简.2（新版）（当当专供）",
                                "//img3m2.ddimg.cn/56/12/29649962-1_l_1700027194.jpg", "青春文学", 35.80);
                bookRepository.save(book190);
                Book book191 = new Book("七根凶简", "尾鱼 著，磨铁文化 出品", "9788095364467", "七根凶简（新版）（当当专供）",
                                "//img3m3.ddimg.cn/57/13/29649963-1_l_1699951245.jpg", "青春文学", 35.80);
                bookRepository.save(book191);
                Book book192 = new Book("神印王座第二部皓月当空12", "唐家三少", "9784493613510", "神印王座第二部皓月当空12",
                                "//img3m6.ddimg.cn/88/23/29654746-1_l_1702525084.jpg", "青春文学", 19.10);
                bookRepository.save(book192);
                Book book193 = new Book("十五年等待候鸟完美纪念版【专属限量签名】", "盈风  著； 欣欣向爱   出品", "9781945197628",
                                "十五年等待候鸟完美纪念版【专属限量签名】",
                                "//img3m4.ddimg.cn/6/28/29632884-1_l_1703484640.jpg", "青春文学", 31.80);
                bookRepository.save(book193);
                Book book194 = new Book("失联宇宙", "唯酒，大鱼文化", "9781504679060", "失联宇宙（全2册）",
                                "//img3m5.ddimg.cn/21/25/29642205-1_l_1701743302.jpg", "青春文学", 36.20);
                bookRepository.save(book194);
                Book book195 = new Book("他的耳机牵着你的夏天", "意恐迟迟，大鱼文化", "9784345745727", "他的耳机牵着你的夏天",
                                "//img3m8.ddimg.cn/21/16/29646858-1_l_1699254027.jpg", "青春文学", 25.20);
                bookRepository.save(book195);
                Book book196 = new Book("三遇咸鱼", "比卡比 著；星文文化 出品", "9783816874867",
                                "三遇咸鱼（全二册）（限量亲签（上册印签，下册亲签）；网络名《三嫁咸鱼》，高人气作家比卡比古风治愈系力作）",
                                "//img3m6.ddimg.cn/37/34/29632816-1_l_1701666282.jpg", "青春文学", 74.40);
                bookRepository.save(book196);
                Book book197 = new Book("难惹", "樱慕松，大鱼文化", "9789196908536", "难惹",
                                "//img3m7.ddimg.cn/59/17/29635907-1_l_1697009215.jpg", "青春文学", 23.50);
                bookRepository.save(book197);
                Book book198 = new Book("终点是你", "半颗苹果，大鱼文化", "9788795810103", "终点是你",
                                "//img3m9.ddimg.cn/91/22/29638909-1_l_1697528659.jpg", "青春文学", 25.20);
                bookRepository.save(book198);
                Book book199 = new Book("难追", "苹果馅包子，大鱼文化", "9788247677483", "难追",
                                "//img3m4.ddimg.cn/20/24/29642204-1_l_1698133870.jpg", "青春文学", 23.50);
                bookRepository.save(book199);
                Book book200 = new Book("明月照林", "比安，大鱼文化", "9784125892207", "明月照林",
                                "//img3m6.ddimg.cn/11/30/29653976-1_l_1700197190.jpg", "青春文学", 21.90);
                bookRepository.save(book200);
                Book book201 = new Book("有风在野", "苏一姗，大鱼文化", "9786819288563", "有风在野",
                                "//img3m8.ddimg.cn/13/32/29653978-1_l_1700197202.jpg", "青春文学", 24.80);
                bookRepository.save(book201);
                Book book202 = new Book("落日出逃", "蔼柚，大鱼文化", "9789233167001", "落日出逃",
                                "//img3m1.ddimg.cn/17/17/29662991-1_l_1701851773.jpg", "青春文学", 23.50);
                bookRepository.save(book202);
                Book book203 = new Book("请星星捎个信", "阮栖，大鱼文化", "9783965909397", "请星星捎个信",
                                "//img3m5.ddimg.cn/21/21/29662995-1_l_1702282305.jpg", "青春文学", 23.50);
                bookRepository.save(book203);
                Book book204 = new Book("银鞍白马度春风·壹 沧海暮夜著 含特约8000字番外【随书附赠彩色亲笔印特签+四种六款赠品】佰万影视剧签约原作《长风渡》《观鹤笔记》同款古风大女主文",
                                "沧海暮夜",
                                "9783464735237",
                                "银鞍白马度春风·壹 沧海暮夜著 含特约8000字番外【随书附赠彩色亲笔印特签+四种六款赠品】佰万影视剧签约原作《长风渡》《观鹤笔记》同款古风大女主文",
                                "//img3m4.ddimg.cn/8/11/29652884-1_l_1700029725.jpg", "青春文学", 33.70);
                bookRepository.save(book204);
                Book book205 = new Book("和离", "九鹭非香 著,博集天卷 出品", "9788469282830", "和离（当当亲签版，人气玄幻作家九鹭非香甜虐交织的救赎之作）",
                                "//img3m5.ddimg.cn/53/17/29652335-1_l_1701936145.jpg", "青春文学", 29.00);
                bookRepository.save(book205);
                Book book206 = new Book("小说绘293", "裟椤双树，橘花散里，两色风景，悠世，原晓，闲晴，萧十一狼，李惟七等", "9788261334744", "小说绘293（2312）",
                                "//img3m8.ddimg.cn/33/6/29654988-1_l_1701073368.jpg", "青春文学", 8.30);
                bookRepository.save(book206);
                Book book207 = new Book("万相之王14·灵相洞天", "天蚕土豆", "9782233884596", "万相之王14·灵相洞天",
                                "//img3m2.ddimg.cn/97/24/29656042-1_l_1701069013.jpg", "青春文学", 20.20);
                bookRepository.save(book207);
                Book book208 = new Book("月明千里", "罗青梅  著,  悦读纪 出品", "9789379407276",
                                "月明千里（和亲公主李瑶英×双面君王昙摩罗伽，“高岭之花下神坛”巅峰代表作！）",
                                "//img3m3.ddimg.cn/14/0/29662493-1_l_1701930724.jpg", "青春文学", 43.90);
                bookRepository.save(book208);
                Book book209 = new Book("月明千里终结篇", "罗青梅 著,  悦读纪 出品", "9781149554210",
                                "月明千里终结篇（和亲公主李瑶英×双面君王昙摩罗伽，“高岭之花下神坛”巅峰代表作！）",
                                "//img3m5.ddimg.cn/16/2/29662495-1_l_1701932641.jpg",
                                "青春文学", 43.90);
                bookRepository.save(book209);
                Book book210 = new Book("师父他太难了终结篇", "扶华  著,  悦读纪 出品", "9787992542664",
                                "师父他太难了终结篇（“社恐”熊猫妖师父与“社牛”徒弟跨越两世的甜宠之恋！）",
                                "//img3m1.ddimg.cn/72/8/29647701-1_l_1699331090.jpg", "青春文学", 41.20);
                bookRepository.save(book210);
                Book book211 = new Book("找得着北", "杏仁茶 魅丽文化", "9785821815170", "找得着北",
                                "//img3m1.ddimg.cn/55/25/29632141-1_l_1695617765.jpg", "青春文学", 31.00);
                bookRepository.save(book211);
                Book book212 = new Book("甜雾", "奶糖酥 魅丽文化", "9781114877658", "甜雾",
                                "//img3m1.ddimg.cn/95/12/29642081-1_l_1698131701.jpg", "青春文学", 32.20);
                bookRepository.save(book212);
                Book book213 = new Book("不见面的男朋友", "山栀子 魅丽文化", "9787533998813", "不见面的男朋友",
                                "//img3m0.ddimg.cn/68/12/29646410-1_l_1698911701.jpg", "青春文学", 32.20);
                bookRepository.save(book213);
                Book book214 = new Book("霍太太，你马甲又掉了5", "晴小天 魅丽文化", "9784662281007", "霍太太，你马甲又掉了5",
                                "//img3m1.ddimg.cn/69/13/29646411-1_l_1698913720.jpg", "青春文学", 34.30);
                bookRepository.save(book214);
                Book book215 = new Book("祝春天", "木甜 魅丽文化", "9789167565003", "祝春天",
                                "//img3m8.ddimg.cn/83/17/29647118-1_l_1699243554.jpg", "青春文学", 32.20);
                bookRepository.save(book215);
                Book book216 = new Book("岳飞篆刻", "肖勇", "9787035238585", "岳飞篆刻",
                                "//img3m1.ddimg.cn/51/20/29657481-1_l_1701421942.jpg", "艺术", 33.80);
                bookRepository.save(book216);
                Book book217 = new Book("大话中国艺术史", "意公子；读客文化 出品", "9787558237386", "大话中国艺术史",
                                "//img3m5.ddimg.cn/7/10/29374495-1_l_14.jpg", "艺术", 59.00);
                bookRepository.save(book217);
                Book book218 = new Book("光的共鸣", "徐尤点 著", "9781822931321", "光的共鸣",
                                "//img3m8.ddimg.cn/70/11/29641858-1_l_1699351946.jpg", "艺术", 103.10);
                bookRepository.save(book218);
                Book book219 = new Book("有书", "[意] 西尔维亚·马拉古齐 等", "9782842791834", "有书",
                                "//img3m1.ddimg.cn/28/36/29485891-1_l_12.jpg", "艺术", 245.00);
                bookRepository.save(book219);
                Book book220 = new Book("迷墙", "严明 著", "9782708259065",
                                "迷墙（侯登科奖得主、著名摄影师严明彩色摄影集，百余幅新作集结面世！黑白到彩色，是不愿复制自己的一次转身、突破和超越！）",
                                "//img3m8.ddimg.cn/18/33/29656458-1_l_1701320668.jpg", "艺术", 102.70);
                bookRepository.save(book220);
                Book book221 = new Book("蒙古世纪：元代中国的视觉文化", "[英］马啸鸿（Shane McCausland） 著，赖星睿 译", "9785510265286",
                                "蒙古世纪：元代中国的视觉文化（1271—1368）", "//img3m4.ddimg.cn/40/22/29664994-1_l_1702286301.jpg",
                                "艺术", 104.80);
                bookRepository.save(book221);
                Book book222 = new Book("费秉勋古典审美三部：中国古典舞蹈的韵与美", "费秉勋", "9785079073810", "费秉勋古典审美三部：中国古典舞蹈的韵与美",
                                "//img3m7.ddimg.cn/14/8/29650217-1_l_1701678115.jpg", "艺术", 34.50);
                bookRepository.save(book222);
                Book book223 = new Book("日子无言，却刻画了所有变迁", "齐白石；张次溪", "9786494963366", "日子无言，却刻画了所有变迁",
                                "//img3m5.ddimg.cn/79/0/29657905-1_l_1701835235.jpg", "艺术", 31.90);
                bookRepository.save(book223);
                Book book224 = new Book("大师导读：从波提切利到梵高", "上海博物馆　编", "9780886748685", "大师导读：从波提切利到梵高",
                                "//img3m6.ddimg.cn/58/30/29654716-1_l_1700548442.jpg", "艺术", 73.40);
                bookRepository.save(book224);
                Book book225 = new Book("中国碑帖经典·颜真卿自书告身祭侄稿墨迹", "上海书画出版社 编", "9786430250260", "中国碑帖经典·颜真卿自书告身祭侄稿墨迹",
                                "//img3m6.ddimg.cn/30/34/29656866-1_l_1701760489.jpg", "艺术", 9.00);
                bookRepository.save(book225);
                Book book226 = new Book("琵琶基础演奏练习", "焦建敏", "9780395391228", "琵琶基础演奏练习",
                                "//img3m5.ddimg.cn/20/12/29656955-1_l_1700722124.jpg", "艺术", 26.40);
                bookRepository.save(book226);
                Book book227 = new Book("阮基础演奏练习", "陈雅明", "9786734116101", "阮基础演奏练习",
                                "//img3m6.ddimg.cn/21/13/29656956-1_l_1700724141.jpg", "艺术", 25.30);
                bookRepository.save(book227);
                Book book228 = new Book("视觉饕餮", "高色调文化", "9782707186584", "视觉饕餮",
                                "//img3m5.ddimg.cn/86/8/29665535-1_l_1703407785.jpg", "艺术", 148.50);
                bookRepository.save(book228);
                Book book229 = new Book("故宫服饰色彩图典", "郭浩 李文儒", "9787160272591",
                                "故宫服饰色彩图典（全两册）中国传统色系列作者郭浩 著 一书全览清代宫廷服饰华美倩影，一书掌握中国传统配色典雅的秘密 中信出版社",
                                "//img3m1.ddimg.cn/6/29/29633181-1_l_1700735602.jpg", "艺术", 199.00);
                bookRepository.save(book229);
                Book book230 = new Book("米开朗琪罗：所有作品的呈现、解读与影响", "[英]路德维希·戈德沙伊德  后浪", "9784674709575",
                                "米开朗琪罗：所有作品的呈现、解读与影响",
                                "//img3m2.ddimg.cn/67/24/29628292-1_l_1702460386.jpg", "艺术", 150.00);
                bookRepository.save(book230);
                Book book231 = new Book("艺术与观念14：米开朗基罗", "[英]安东尼·休斯  后浪", "9788317886654", "艺术与观念14：米开朗基罗",
                                "//img3m1.ddimg.cn/15/34/29642991-1_l_1701069730.jpg", "艺术", 121.60);
                bookRepository.save(book231);
                Book book232 = new Book("我的邻居宫崎骏", "美国Spoke画廊", "9780390900319", "我的邻居宫崎骏",
                                "//img3m1.ddimg.cn/78/9/29657211-1_l_1701849982.jpg", "艺术", 168.20);
                bookRepository.save(book232);
                Book book233 = new Book("闽戏掠影", "杨秀晖 著", "9782862754093", "闽戏掠影",
                                "//img3m7.ddimg.cn/36/17/29657367-1_l_1701843346.jpg", "艺术", 43.50);
                bookRepository.save(book233);
                Book book234 = new Book("儿童国画入门丛书——儿童五步学国画", "栀白国画", "9783206800087", "儿童国画入门丛书——儿童五步学国画",
                                "//img3m4.ddimg.cn/88/9/29657914-1_l_1701334577.jpg", "艺术", 15.40);
                bookRepository.save(book234);
                Book book235 = new Book("蛇狐jaco黑白插画：单色：质感黑白插画研习课+单色集：蛇狐的黑白插画图鉴", "[日]蛇狐 著", "9782068246637",
                                "蛇狐jaco黑白插画：单色：质感黑白插画研习课+单色集：蛇狐的黑白插画图鉴（套装2册）",
                                "//img3m9.ddimg.cn/49/0/29659459-1_l_1702280992.jpg",
                                "艺术", 125.90);
                bookRepository.save(book235);
                Book book236 = new Book("拜厄钢琴基本教程", "郑艳丽", "9780276499067", "拜厄钢琴基本教程",
                                "//img3m8.ddimg.cn/36/21/29662218-1_l_1703130162.jpg", "艺术", 14.30);
                bookRepository.save(book236);
                Book book237 = new Book("孩子们的拜厄", "郑艳丽", "9780153880100", "孩子们的拜厄",
                                "//img3m6.ddimg.cn/36/34/29662416-1_l_1703055533.jpg", "艺术", 26.40);
                bookRepository.save(book237);
                Book book238 = new Book("车尔尼三十条钢琴指法", "郑艳丽", "9780039170950", "车尔尼三十条钢琴指法",
                                "//img3m8.ddimg.cn/38/36/29662418-1_l_1703055531.jpg", "艺术", 13.80);
                bookRepository.save(book238);
                Book book239 = new Book("隋代墓志精粹二：席晖华墓志、吕琼华墓志、史崇基墓志、辛偘墓志、柳敬言墓志、于懿墓志、窦彦墓志、包恺墓志", "本社 编", "9782539760884",
                                "隋代墓志精粹二：席晖华墓志、吕琼华墓志、史崇基墓志、辛偘墓志、柳敬言墓志、于懿墓志、窦彦墓志、包恺墓志",
                                "//img3m9.ddimg.cn/34/9/29662909-1_l_1702020669.jpg", "艺术", 52.40);
                bookRepository.save(book239);
                Book book240 = new Book("隋代墓志精粹四：崔宣度墓志、卢思容墓志、源刚墓志、元俭墓志、元睿墓志、刘弘墓志、张摩子墓志", "本社 编", "9784518160807",
                                "隋代墓志精粹四：崔宣度墓志、卢思容墓志、源刚墓志、元俭墓志、元睿墓志、刘弘墓志、张摩子墓志",
                                "//img3m6.ddimg.cn/41/16/29662916-1_l_1702020644.jpg",
                                "艺术", 55.60);
                bookRepository.save(book240);
                Book book241 = new Book("隋代墓志精粹三：解昭墓志、于斌墓志、衙闻墓志、钱大忍墓志、豆卢贤墓志、刘度墓志、周法尚墓志", "本社 编", "9783790627114",
                                "隋代墓志精粹三：解昭墓志、于斌墓志、衙闻墓志、钱大忍墓志、豆卢贤墓志、刘度墓志、周法尚墓志",
                                "//img3m7.ddimg.cn/42/17/29662917-1_l_1702020659.jpg",
                                "艺术", 52.40);
                bookRepository.save(book241);
                Book book242 = new Book("隋代墓志精粹一：武德皇后阿史那氏墓志、王升墓志、乙弗明墓志、郑祁耶墓志、萧妙瑜墓志、张宪卿墓志、张振妻韦氏墓志、解方保墓志、刘豪墓志、杜佑墓志",
                                "本社 编",
                                "9786894249480",
                                "隋代墓志精粹一：武德皇后阿史那氏墓志、王升墓志、乙弗明墓志、郑祁耶墓志、萧妙瑜墓志、张宪卿墓志、张振妻韦氏墓志、解方保墓志、刘豪墓志、杜佑墓志",
                                "//img3m8.ddimg.cn/43/18/29662918-1_l_1702019287.jpg", "艺术", 54.00);
                bookRepository.save(book242);
                Book book243 = new Book("元朱文印纵横谈", "沈乐平 著", "9783536635052", "元朱文印纵横谈",
                                "//img3m2.ddimg.cn/67/5/29662942-1_l_1701934796.jpg", "艺术", 129.40);
                bookRepository.save(book243);
                Book book244 = new Book("不器：金文名品", "杭州市临平博物馆 编", "9785332754449", "不器：金文名品",
                                "//img3m8.ddimg.cn/82/24/29667808-1_l_1702887479.jpg", "艺术", 235.80);
                bookRepository.save(book244);
                Book book245 = new Book("中国美术研究·书法史研究", "山东大学艺术学院 编", "9789025571443", "中国美术研究·书法史研究",
                                "//img3m3.ddimg.cn/72/28/29668293-1_l_1702970418.jpg", "艺术", 104.80);
                bookRepository.save(book245);
                Book book246 = new Book("名家：齐白石、王雪涛、郭味蕖", "卢炘、杨振宇 主编", "9780882718248", "名家：齐白石、王雪涛、郭味蕖",
                                "//img3m4.ddimg.cn/73/29/29668294-1_l_1702970428.jpg", "艺术", 129.40);
                bookRepository.save(book246);
                Book book247 = new Book("", "[摩洛哥]塔哈尔·本·杰伦 著，尉光吉 译", "9782661108066", "（守望者·形视）贾科梅蒂",
                                "//img3m7.ddimg.cn/95/5/29658317-1_l_1701332655.jpg", "艺术", 33.60);
                bookRepository.save(book247);
                Book book248 = new Book("", "[美]唐纳德·普雷齐奥西，[美]克莱尔·法拉戈 著，谷文文 译", "9781882024230", "（当代学术棱镜译丛）艺术并非你想的那样",
                                "//img3m4.ddimg.cn/75/34/29665524-1_l_1702610270.jpg", "艺术", 35.40);
                bookRepository.save(book248);
                Book book249 = new Book("艺术与历史：哈斯克尔的史学成就和西方艺术史的发展", "曹意强", "9789776546295", "艺术与历史：哈斯克尔的史学成就和西方艺术史的发展",
                                "//img3m3.ddimg.cn/80/2/29658203-1_l_1702950258.jpg", "艺术", 65.90);
                bookRepository.save(book249);
                Book book250 = new Book("香港电影文化的对外传播", "康宁 著", "9782860842785", "香港电影文化的对外传播",
                                "//img3m5.ddimg.cn/29/35/29664785-1_l_1702957814.jpg", "艺术", 51.00);
                bookRepository.save(book250);
                Book book251 = new Book("爆款剧本密码", "[韩] 孙正铉 著，崔晓东 译", "9788204789624", "爆款剧本密码",
                                "//img3m1.ddimg.cn/95/27/29664851-1_l_1703409910.jpg", "艺术", 47.10);
                bookRepository.save(book251);
                Book book252 = new Book("聊聊", "倪萍", "9786602356479", "聊聊",
                                "//img3m5.ddimg.cn/72/26/29638395-1_l_1698993886.jpg", "成功励志", 49.00);
                bookRepository.save(book252);
                Book book253 = new Book("软技能", "刘擎 等著; 得到图书 出品", "9789236042107", "软技能",
                                "//img3m5.ddimg.cn/32/0/29583905-1_l_1690174818.jpg", "成功励志", 49.00);
                bookRepository.save(book253);
                Book book254 = new Book("魔术记忆 30分钟释放记忆力潜能", "（美）凯文?特鲁多", "9789266856644", "魔术记忆 30分钟释放记忆力潜能",
                                "//img3m8.ddimg.cn/94/23/29638318-1_l_1698736622.jpg", "成功励志", 29.50);
                bookRepository.save(book254);
                Book book255 = new Book("宝贵的人生建议：我希望早点知道的", "凯文·凯利    Kevin Kelly", "9789011441521",
                                "宝贵的人生建议：我希望早点知道的智慧（《失控》作者凯文·凯利全新作品）",
                                "//img3m1.ddimg.cn/39/23/29621631-1_l_1693904066.jpg", "成功励志",
                                49.00);
                bookRepository.save(book255);
                Book book256 = new Book("被讨厌的勇气：“自我启发之父”阿", "岸見一郎, 古賀史健", "9785096189785",
                                "被讨厌的勇气：“自我启发之父”阿德勒的哲学课 岸见一郎",
                                "//img3m2.ddimg.cn/33/26/28518072-1_l_9.jpg", "成功励志", 27.50);
                bookRepository.save(book256);
                Book book257 = new Book("优秀的绵羊", "（美）威廉·德雷谢维奇 ，阳光博客 出品", "9784272098798", "优秀的绵羊",
                                "//img3m8.ddimg.cn/8/18/23922368-1_l_1702967157.jpg", "成功励志", 21.00);
                bookRepository.save(book257);
                Book book258 = new Book("沟通的方法", "脱不花 著，得到图书 出品", "9787592703151",
                                "沟通的方法（畅销70万册 得到CEO脱不花为你准备的沟通心法，助你职场一路开挂。现在加入沟通的无限游戏吧）",
                                "//img3m9.ddimg.cn/81/16/29251809-1_l_1689230064.jpg", "成功励志", 49.00);
                bookRepository.save(book258);
                Book book259 = new Book("非暴力沟通", "（美）马歇尔 卢森堡Marshall B.Rosenberg", "9789494307208", "非暴力沟通（修订版）",
                                "//img3m2.ddimg.cn/54/11/29302272-1_l_1700118620.jpg", "成功励志", 48.10);
                bookRepository.save(book259);
                Book book260 = new Book("极简学习法", "廖恒 著  时代华语 出品", "9784967461487", "极简学习法（考试高分的秘密，上百位清北学霸学习方法大公开）",
                                "//img3m3.ddimg.cn/6/10/29389443-1_l_1699411435.jpg", "成功励志", 22.50);
                bookRepository.save(book260);
                Book book261 = new Book("一页纸唤醒学习力", "王健文", "9787643673181", "一页纸唤醒学习力",
                                "//img3m1.ddimg.cn/64/17/29370691-1_l_14.jpg", "成功励志", 24.50);
                bookRepository.save(book261);
                Book book262 = new Book("学习天性", "(英) 乔·博勒  著，磨铁文化 出品", "9786930086680", "学习天性",
                                "//img3m3.ddimg.cn/24/32/29383323-1_l_6.jpg", "成功励志", 27.50);
                bookRepository.save(book262);
                Book book263 = new Book("允许一切发生：过不紧绷松弛的人生", "李梦霁", "9788291654058",
                                "允许一切发生：过不紧绷松弛的人生（董宇辉、海灵格、莫言、演员吴越倡导的生活方式。给当下年轻人的治愈成长哲思书）",
                                "//img3m1.ddimg.cn/67/4/29560081-1_l_1702260597.jpg", "成功励志", 29.00);
                bookRepository.save(book263);
                Book book264 = new Book("起床后的黄金一小时", "[日] 池田千惠著， 范宏涛译，紫图图书  出品", "9785971360490", "起床后的黄金一小时",
                                "//img3m9.ddimg.cn/64/33/29199619-1_l_1694161589.jpg", "成功励志", 24.70);
                bookRepository.save(book264);
                Book book265 = new Book("你想与谁相伴一生？感动全球亿万人", "［德］海克·法勒 文  后浪", "9780280107033",
                                "你想与谁相伴一生？感动全球亿万人的暖心治愈绘本，《 你想过怎样的一生？》姐妹篇，告白/节日礼物！",
                                "//img3m0.ddimg.cn/43/16/29339980-1_l_1697180054.jpg", "成功励志", 59.00);
                bookRepository.save(book265);
                Book book266 = new Book("你所谓的稳定，不过是在浪费生命", "李尚龙  著，磨铁文化 出品", "9781420939255", "你所谓的稳定，不过是在浪费生命",
                                "//img3m5.ddimg.cn/76/19/29382385-1_l_4.jpg", "成功励志", 24.90);
                bookRepository.save(book266);
                Book book267 = new Book("复杂世界的明白人", "九边  著，磨铁文化 出品", "9789250014838", "复杂世界的明白人",
                                "//img3m6.ddimg.cn/97/21/29343796-1_l_1702268400.jpg", "成功励志", 23.20);
                bookRepository.save(book267);
                Book book268 = new Book("钝感力", "渡边淳一著；李迎跃 译;", "9786331153615", "钝感力",
                                "//img3m9.ddimg.cn/23/12/25201859-1_l_1698985798.jpg", "成功励志", 16.00);
                bookRepository.save(book268);
                Book book269 = new Book("呼吸04：珍惜吧，日常的光", "Breathe编辑部", "9783086626845", "呼吸04：珍惜吧，日常的光",
                                "//img3m6.ddimg.cn/4/1/29380036-1_l_9.jpg", "成功励志", 44.80);
                bookRepository.save(book269);
                Book book270 = new Book("愿你温柔且坚", "周冲 著 时代华语 出品", "9782076109276", "愿你温柔且坚",
                                "//img3m0.ddimg.cn/6/25/29335290-1_l_1691483520.jpg", "成功励志", 45.10);
                bookRepository.save(book270);
                Book book271 = new Book("哇，飒女孩", "言六一,麦田文化出品", "9784642551168", "哇，飒女孩",
                                "//img3m6.ddimg.cn/6/27/29387166-1_l_11.jpg", "成功励志", 30.80);
                bookRepository.save(book271);
                Book book272 = new Book("拆掉思维里的墙", "古典", "9786193242724", "拆掉思维里的墙（白金升级版）",
                                "//img3m5.ddimg.cn/38/14/29315225-1_l_18.jpg", "成功励志", 44.20);
                bookRepository.save(book272);
                Book book273 = new Book("高效赋能：八大习惯变现指南，让效", "（英）本·伊利亚著 ，信任 译，斯坦威 出品", "9789755300559",
                                "高效赋能：八大习惯变现指南，让效率爆发式增长",
                                "//img3m6.ddimg.cn/76/9/29002126-1_l_8.jpg", "成功励志", 20.20);
                bookRepository.save(book273);
                Book book274 = new Book("高情商沟通", "青音，果麦文化 出品", "9784721543206",
                                "高情商沟通（周国平、吴晓波、李松蔚、剽悍一只猫诚意推荐！全国播音主持 “金话筒”奖得主青音，针对日常生活场景，教你有情商地说话）",
                                "//img3m8.ddimg.cn/81/16/29262798-1_l_12.jpg", "成功励志", 37.30);
                bookRepository.save(book274);
                Book book275 = new Book("倾听力", "吴怀尧 著，王芳樊登 推荐，作家榜 出品", "9780896195165",
                                "倾听力（帮你突破人际交往能力！怎么听对方才肯说，如何说对方才会听？18个打开心扉的经典案例！）",
                                "//img3m0.ddimg.cn/21/31/29354610-1_l_1688629922.jpg", "成功励志", 45.90);
                bookRepository.save(book275);
                Book book276 = new Book("弹性生长 ", "九边", "9784859977546",
                                "弹性生长 （九边帮你洞悉择业、房价、科技、经济变化趋势。在不确定时代，做懂应变、知进退的明白人！）",
                                "//img3m9.ddimg.cn/13/36/29658829-1_l_1702962819.jpg", "成功励志", 39.90);
                bookRepository.save(book276);
                Book book277 = new Book("人生每一步都算数", "柳智宇 著,博集天卷 出品", "9780454466614",
                                "人生每一步都算数（当当专享签章版+金句小册子+线上课程，俞敏洪作序推荐！“传奇经历者”柳智宇迄今为止人生的传记作品！）",
                                "//img3m9.ddimg.cn/77/34/29661269-1_l_1702001575.jpg", "成功励志", 36.00);
                bookRepository.save(book277);
                Book book278 = new Book("如何工作，家庭才能幸福？如何生活，事业才能成功？", "【美】斯图尔特·D.弗里德曼【美】艾丽莎·F.韦斯特林 著 译者：刘勇军",
                                "9782402224338",
                                "如何工作，家庭才能幸福？如何生活，事业才能成功？（一本帮助职场父母平衡工作与家庭的实操指南）",
                                "//img3m2.ddimg.cn/76/25/29658892-1_l_1702514883.jpg",
                                "成功励志", 49.00);
                bookRepository.save(book278);
                Book book279 = new Book("意林合订本2023年19期-24期", "意林编辑部", "9780356022864", "意林合订本2023年19期-24期（总第79卷）（升级版）",
                                "//img3m9.ddimg.cn/75/6/29646219-1_l_1702891312.jpg", "成功励志", 22.50);
                bookRepository.save(book279);
                Book book280 = new Book("为什么我总是改不了", "[英]加比亚·图莱克", "9783079268663", "为什么我总是改不了",
                                "//img3m4.ddimg.cn/40/24/29636284-1_l_1701859270.jpg", "成功励志", 43.00);
                bookRepository.save(book280);
                Book book281 = new Book("相约星期二未完的人生课", "[美] 莫里·施瓦茨 著", "9789288417588", "相约星期二未完的人生课",
                                "//img3m0.ddimg.cn/28/32/29664190-1_l_1703244981.jpg", "成功励志", 44.20);
                bookRepository.save(book281);
                Book book282 = new Book("带点锋芒又何妨", "郭城", "9783550484834", "带点锋芒又何妨",
                                "//img3m3.ddimg.cn/31/35/29664193-1_l_1702439992.jpg", "成功励志", 51.00);
                bookRepository.save(book282);
                Book book283 = new Book("说到点上", "王专", "9781199650030", "说到点上",
                                "//img3m6.ddimg.cn/34/1/29664196-1_l_1702439780.jpg", "成功励志", 44.20);
                bookRepository.save(book283);
                Book book284 = new Book("蜕变：女性的职场领导力守则", "［英］凯蒂·默里（Katy,Murray）", "9788340890376", "蜕变：女性的职场领导力守则",
                                "//img3m5.ddimg.cn/36/22/29662515-1_l_1702448538.jpg", "成功励志", 34.50);
                bookRepository.save(book284);
                Book book285 = new Book("冥想5分钟，等于熟睡一小时 睡不好，学冥想！经典畅销12年，掀起国内冥想热潮，全新修订上市", "[美]里克·汉森 理查德·蒙迪思；读客文化 出品",
                                "9784230608175", "冥想5分钟，等于熟睡一小时 睡不好，学冥想！经典畅销12年，掀起国内冥想热潮，全新修订上市",
                                "//img3m2.ddimg.cn/8/18/29665952-1_l_1702624788.jpg", "成功励志", 34.40);
                bookRepository.save(book285);
                Book book286 = new Book("高效成长：八力模型助你爆发式成长", "木沐", "9789280752663", "高效成长：八力模型助你爆发式成长",
                                "//img3m3.ddimg.cn/42/16/29666283-1_l_1702536831.jpg", "成功励志", 31.00);
                bookRepository.save(book286);
                Book book287 = new Book("不累：超简单的精力管理课", "伊沙贝", "9784116356176", "不累：超简单的精力管理课",
                                "//img3m7.ddimg.cn/82/3/29668897-1_l_1703055703.jpg", "成功励志", 44.80);
                bookRepository.save(book287);
                Book book288 = new Book("效率手册·读书", "靳一石", "9783350520367", "效率手册·读书",
                                "//img3m3.ddimg.cn/23/11/29659433-1_l_1701686430.jpg", "成功励志", 25.50);
                bookRepository.save(book288);
                Book book289 = new Book("效率手册·运动", "靳一石", "9784084870483", "效率手册·运动",
                                "//img3m2.ddimg.cn/63/2/29659572-1_l_1701486343.jpg", "成功励志", 25.50);
                bookRepository.save(book289);
                Book book290 = new Book("效率手册·旅游", "靳一石", "9789651101403", "效率手册·旅游",
                                "//img3m3.ddimg.cn/64/3/29659573-1_l_1701509167.jpg", "成功励志", 25.50);
                bookRepository.save(book290);
                Book book291 = new Book("效率手册·美食", "靳一石", "9786554510448", "效率手册·美食",
                                "//img3m4.ddimg.cn/65/4/29659574-1_l_1701509167.jpg", "成功励志", 25.50);
                bookRepository.save(book291);
                Book book292 = new Book("提升你的沟通技能", "[英] 艾伦·巴克 著", "9789112669725", "提升你的沟通技能（第六版）",
                                "//img3m1.ddimg.cn/92/13/29661581-1_l_1703056147.jpg", "成功励志", 36.00);
                bookRepository.save(book292);
                Book book293 = new Book("去珠峰", "王巍", "9781218352839", "去珠峰",
                                "//img3m5.ddimg.cn/36/4/29664495-1_l_1702280510.jpg", "成功励志", 66.00);
                bookRepository.save(book293);
                Book book294 = new Book("接待的艺术：中国人的规矩 为人处世的厚黑学之道 中国式人情世故学会变通成大事", "史小东", "9787708144632",
                                "接待的艺术：中国人的规矩 为人处世的厚黑学之道 中国式人情世故学会变通成大事",
                                "//img3m5.ddimg.cn/59/13/29642045-1_l_1701475669.jpg", "成功励志",
                                40.70);
                bookRepository.save(book294);
                Book book295 = new Book("淡定：南怀瑾讲人生智慧", "徐枫 著", "9782896430314", "淡定：南怀瑾讲人生智慧",
                                "//img3m0.ddimg.cn/61/33/29643730-1_l_1703229322.jpg", "成功励志", 38.80);
                bookRepository.save(book295);
                Book book296 = new Book("3分钟漫画回话技术：好好接话 一句顶一万句", "尚英丽", "9784584338421", "3分钟漫画回话技术：好好接话 一句顶一万句",
                                "//img3m3.ddimg.cn/70/25/29642353-1_l_1700973881.jpg", "成功励志", 34.30);
                bookRepository.save(book296);
                Book book297 = new Book("漫画图解中国人的礼仪规矩： 为人处世求人办事会客商务应酬称呼社交礼仪中国式的酒桌话术书酒局饭局攻略社交课人情世故", "尚英丽",
                                "9788014411944",
                                "漫画图解中国人的礼仪规矩： 为人处世求人办事会客商务应酬称呼社交礼仪中国式的酒桌话术书酒局饭局攻略社交课人情世故",
                                "//img3m9.ddimg.cn/43/19/29655889-1_l_1700984397.jpg", "成功励志", 34.30);
                bookRepository.save(book297);
                Book book298 = new Book("3分钟漫画口才三绝：会赞美会幽默会拒绝 每天懂一点人情世故，非暴力沟通一句顶一万句，好好接话回话的技术", "杜赢 著", "9780056464131",
                                "3分钟漫画口才三绝：会赞美会幽默会拒绝 每天懂一点人情世故，非暴力沟通一句顶一万句，好好接话回话的技术",
                                "//img3m8.ddimg.cn/85/35/29659198-1_l_1703487689.jpg", "成功励志", 34.30);
                bookRepository.save(book298);
                Book book299 = new Book("3分钟漫画为人三会：会说话会办事会做人 每天懂一点人情世故，非暴力沟通一句顶一万句，好好接话回话的技术", "杜赢", "9780291251183",
                                "3分钟漫画为人三会：会说话会办事会做人 每天懂一点人情世故，非暴力沟通一句顶一万句，好好接话回话的技术",
                                "//img3m0.ddimg.cn/87/0/29659200-1_l_1703487690.jpg", "成功励志", 34.30);
                bookRepository.save(book299);
                Book book300 = new Book("年终汇报 职场人的成绩单升职加薪的起跳板提高表达能力凸显自身价值竞争力技巧书籍年中汇报难题指南", "新励成", "9784600014117",
                                "年终汇报 职场人的成绩单升职加薪的起跳板提高表达能力凸显自身价值竞争力技巧书籍年中汇报难题指南",
                                "//img3m5.ddimg.cn/67/20/29652745-1_l_1701251770.jpg", "成功励志", 30.60);
                bookRepository.save(book300);
                Book book301 = new Book("洛克菲勒写给儿子的38封信正版中文版漫画趣读智囊漫画版漫画少年读家书人生智慧与成功之道勒克克洛落克菲洛非勒家信", "无", "9785866736157",
                                "洛克菲勒写给儿子的38封信正版中文版漫画趣读智囊漫画版漫画少年读家书人生智慧与成功之道勒克克洛落克菲洛非勒家信",
                                "//img3m5.ddimg.cn/59/26/29656895-1_l_1700722100.jpg", "成功励志", 32.80);
                bookRepository.save(book301);
                Book book302 = new Book("学会自己长大", "和云峰 著", "9784768411261", "学会自己长大（三本套）",
                                "//img3m2.ddimg.cn/7/8/29655952-1_l_1700707819.jpg", "成功励志", 107.40);
                bookRepository.save(book302);
                Book book303 = new Book("全套3册洛克菲勒写给儿子的38封信漫画素书智慧奇书石油大王的人生智慧与成功之道小学生商业思维培养 国学智慧正版漫画书籍", "无",
                                "9788246293363",
                                "全套3册洛克菲勒写给儿子的38封信漫画素书智慧奇书石油大王的人生智慧与成功之道小学生商业思维培养 国学智慧正版漫画书籍",
                                "//img3m3.ddimg.cn/55/28/29658673-1_l_1701166953.jpg", "成功励志", 71.80);
                bookRepository.save(book303);
                Book book304 = new Book("心：稻盛和夫的一生嘱托", "稻盛和夫", "9783315530974", "心：稻盛和夫的一生嘱托（纪念版）",
                                "//img3m0.ddimg.cn/17/24/29665070-1_l_1702433140.jpg", "成功励志", 59.80);
                bookRepository.save(book304);
                Book book305 = new Book("请停止无效社交", "肖逸群", "9782692443365", "请停止无效社交",
                                "//img3m3.ddimg.cn/17/14/29665763-1_l_1702957851.jpg", "成功励志", 39.80);
                bookRepository.save(book305);
                Book book306 = new Book("个人IP变现", "粥左罗", "9787903442885", "个人IP变现",
                                "//img3m5.ddimg.cn/10/5/29668825-1_l_1703131544.jpg", "成功励志", 44.80);
                bookRepository.save(book306);
                Book book307 = new Book("打造个人IP", "粥左罗", "9780285381995", "打造个人IP",
                                "//img3m0.ddimg.cn/15/10/29668830-1_l_1703131547.jpg", "成功励志", 59.80);
                bookRepository.save(book307);
                Book book308 = new Book("掌控习惯如何养成好习惯并戒除坏习", "[美]詹姆斯·克利尔 著，迩东晨 译", "9786657058571",
                                "掌控习惯如何养成好习惯并戒除坏习惯 詹姆斯克莱尔 台版译名原子习惯 Atomic Habits中文版 樊登读书会 得到 吴晓波推荐 微习惯 习惯养成书籍",
                                "//img3m0.ddimg.cn/9/13/29638530-1_l_1702347471.jpg", "管理", 29.00);
                bookRepository.save(book308);
                Book book309 = new Book("变与不变", "彭志强 著，湛庐出品", "9781067490317", "变与不变",
                                "//img3m1.ddimg.cn/4/35/29606251-1_l_1701242674.jpg", "管理", 44.90);
                bookRepository.save(book309);
                Book book310 = new Book("胜者心法：资治通鉴成事之道", "冯唐 著；磨铁文化 出品", "9782051253178",
                                "胜者心法：资治通鉴成事之道（冯唐从管理讲透古今胜者之道！随书附赠冯唐书法书签）",
                                "//img3m1.ddimg.cn/39/5/29623611-1_l_1697528643.jpg", "管理",
                                49.60);
                bookRepository.save(book310);
                Book book311 = new Book("认知破局 怎样突破能力、视野和人", "张琦 著，磨铁文化 出品", "9780898595239",
                                "认知破局 怎样突破能力、视野和人脉 全民商业导师张琦给大家的人生破局指南",
                                "//img3m8.ddimg.cn/50/8/29599268-1_l_1689233112.jpg", "管理",
                                49.00);
                bookRepository.save(book311);
                Book book312 = new Book("盛和塾指定学习教材 干法 最新平装", "[日] 稻盛和夫 著，曹岫云 译", "9786747365152", "盛和塾指定学习教材 干法 最新平装本",
                                "//img3m8.ddimg.cn/56/14/29298908-1_l_8.jpg", "管理", 49.00);
                bookRepository.save(book312);
                Book book313 = new Book("定位：争夺用户心智的战争", "[美] 艾·里斯（Al Ries） 杰克·特劳特（Jack Trout）", "9783963218460",
                                "定位：争夺用户心智的战争（经典重译版）", "//img3m6.ddimg.cn/68/27/29200316-1_l_1692158728.jpg", "管理",
                                79.00);
                bookRepository.save(book313);
                Book book314 = new Book("事实", "(瑞典)汉斯·罗斯林等 著；读客文化 出品", "9786099226262",
                                "事实（比尔.盖茨送给全美大学生的毕业礼物！比尔.盖茨逢人就推荐的热门大书！）", "//img3m1.ddimg.cn/3/23/27866721-1_l_5.jpg",
                                "管理", 49.50);
                bookRepository.save(book314);
                Book book315 = new Book("德鲁克 卓有成效的管理者", "（美）彼得·德鲁克（Peter F. Drucker）", "9789998853287",
                                "德鲁克 卓有成效的管理者（55周年新译本）",
                                "//img3m4.ddimg.cn/53/31/29389094-1_l_21.jpg", "管理", 79.00);
                bookRepository.save(book315);
                Book book316 = new Book("王志纲论战略:关键阶段的重大抉择", "王志纲", "9788843459445", "王志纲论战略:关键阶段的重大抉择",
                                "//img3m1.ddimg.cn/58/7/29288911-1_l_14.jpg", "管理", 59.50);
                bookRepository.save(book316);
                Book book317 = new Book("打胜仗：常胜团队的成功密码", "田涛", "9785843456139", "打胜仗：常胜团队的成功密码",
                                "//img3m7.ddimg.cn/84/0/29268147-1_l_16.jpg", "管理", 55.00);
                bookRepository.save(book317);
                Book book318 = new Book("价值共生：数字化时代的组织管理", "陈春花", "9784417876595",
                                "价值共生：数字化时代的组织管理（陈春花教授新作）（团购，请致电010-57993380）",
                                "//img3m0.ddimg.cn/98/17/29217770-1_l_19.jpg", "管理",
                                39.00);
                bookRepository.save(book318);
                Book book319 = new Book("从总账到总监：CFO的财务笔记", "钱自严", "9785662267619", "从总账到总监：CFO的财务笔记",
                                "//img3m9.ddimg.cn/14/33/29177789-1_l_8.jpg", "管理", 34.00);
                bookRepository.save(book319);
                Book book320 = new Book("经营十二条", "[日]稻盛和夫", "9782385788698", "经营十二条",
                                "//img3m4.ddimg.cn/14/10/29324804-1_l_9.jpg", "管理", 34.50);
                bookRepository.save(book320);
                Book book321 = new Book("贝佐斯的数字帝国：亚马逊如何实现", "拉姆", "9780150968573", "贝佐斯的数字帝国：亚马逊如何实现指数级增长",
                                "//img3m1.ddimg.cn/8/7/28534481-1_l_5.jpg", "管理", 34.50);
                bookRepository.save(book321);
                Book book322 = new Book("苏世民：我的经验与教训", "苏世民", "9786759064814",
                                "苏世民：我的经验与教训（一本书读懂苏世民的投资人生，复制黑石创始人投资、管理、创业、人生精进的成功哲学。）",
                                "//img3m1.ddimg.cn/42/25/28515111-1_l_15.jpg",
                                "管理", 63.70);
                bookRepository.save(book322);
                Book book323 = new Book("黄沙百战穿金甲：华为系列故事", "田涛  殷志峰 主编", "9781117360591", "黄沙百战穿金甲：华为系列故事",
                                "//img3m8.ddimg.cn/38/1/25164848-1_l_3.jpg", "管理", 33.60);
                bookRepository.save(book323);
                Book book324 = new Book("手机短视频拍摄、剪辑与运营变现从", "雷波  著", "9788596545433", "手机短视频拍摄、剪辑与运营变现从入门到精通",
                                "//img3m7.ddimg.cn/79/23/29250817-1_l_12.jpg", "管理", 44.00);
                bookRepository.save(book324);
                Book book325 = new Book("营销管理", "菲利普·科特勒，凯文·莱恩·凯勒 著; 何佳讯 于洪彦 牛永革 徐岚 董伊人 金钰  译", "9788171916030",
                                "营销管理（第15版·彩色版）", "//img3m2.ddimg.cn/61/1/29201992-1_l_9.jpg", "管理", 74.00);
                bookRepository.save(book325);
                Book book326 = new Book("极简市场营销：完整体系和落地打法", "胡超", "9789065565532", "极简市场营销：完整体系和落地打法",
                                "//img3m4.ddimg.cn/68/31/29164874-1_l_8.jpg", "管理", 34.00);
                bookRepository.save(book326);
                Book book327 = new Book("疯传：让你的产品、思想、行为像病", "（美）Jonah Berger（乔纳.伯杰）", "9789269046196",
                                "疯传：让你的产品、思想、行为像病毒一样入侵（经典平装版） 团购电话:4001066666转6",
                                "//img3m1.ddimg.cn/86/26/28535351-1_l_9.jpg", "管理",
                                29.00);
                bookRepository.save(book327);
                Book book328 = new Book("有效管理的5大兵法：全新修订版", "孙陶然 著  时代华语 出品", "9781150055195",
                                "有效管理的5大兵法：全新修订版（俞敏洪重磅推荐！修改幅度达50%以上，孙陶然全新管理思想总结）",
                                "//img3m1.ddimg.cn/59/16/29404841-1_l_1691488367.jpg", "管理", 34.50);
                bookRepository.save(book328);
                Book book329 = new Book("能断金刚：超凡的经营智慧", "（美）麦克·罗奇 著  夏理扬 田多多等译，麦点出品", "9787419874149",
                                "能断金刚：超凡的经营智慧（《当和尚遇到钻石》十周年增订版）新版", "//img3m2.ddimg.cn/75/11/29303382-1_l_14.jpg", "管理",
                                26.00);
                bookRepository.save(book329);
                Book book330 = new Book("小团队管理的7个方法 全图解落地版", "任康磊", "9784570714222", "小团队管理的7个方法 全图解落地版",
                                "//img3m8.ddimg.cn/63/7/28477908-1_l_8.jpg", "管理", 34.90);
                bookRepository.save(book330);
                Book book331 = new Book("高绩效教练", "[英]约翰.惠特默（John Whitmore）", "9788710607641",
                                "高绩效教练（原书第5版） 团购电话:4001066666转6",
                                "//img3m1.ddimg.cn/21/6/26240961-1_l_9.jpg", "管理", 39.50);
                bookRepository.save(book331);
                Book book332 = new Book("认知产品", "谈云海", "9782286805166", "认知产品",
                                "//img3m1.ddimg.cn/5/19/29659811-1_l_1702880039.jpg", "管理", 74.20);
                bookRepository.save(book332);
                Book book333 = new Book("境界", "吴军 著；得到图书 出品", "9784258823215",
                                "境界（汲取先贤智慧，提升个人境界，从此看得远、看得透、看得开。文津图书奖得主吴军全新力作）",
                                "//img3m5.ddimg.cn/79/28/29658895-1_l_1701657009.jpg", "管理", 59.00);
                bookRepository.save(book333);
                Book book334 = new Book("无限进步", "李海峰，徐剑", "9782298167955", "无限进步",
                                "//img3m7.ddimg.cn/27/16/29663397-1_l_1703474142.jpg", "管理", 26.00);
                bookRepository.save(book334);
                Book book335 = new Book("打造爆款书：让你身价百倍的21个出书法则——教你从0到1打造爆款书，实现财富与影响力大升级", "晴山", "9786536279127",
                                "打造爆款书：让你身价百倍的21个出书法则——教你从0到1打造爆款书，实现财富与影响力大升级",
                                "//img3m8.ddimg.cn/89/21/29668508-1_l_1702974701.jpg",
                                "管理", 50.20);
                bookRepository.save(book335);
                Book book336 = new Book("极速应对", "本·伯南克", "9788941854517", "极速应对",
                                "//img3m7.ddimg.cn/2/22/29657927-1_l_1703137588.jpg", "管理", 74.20);
                bookRepository.save(book336);
                Book book337 = new Book("2024年政府收支分类科目", "中华人民共和国财政部", "9780879009984", "2024年政府收支分类科目",
                                "//img3m6.ddimg.cn/37/11/29651626-1_l_1699950383.jpg", "管理", 32.90);
                bookRepository.save(book337);
                Book book338 = new Book("营造好环境：掌握道德领导力与维护职场环境 职场领导力提升系列丛书", "［美］ 保罗·法尔科内（Paul Falcone）",
                                "9786432688849",
                                "营造好环境：掌握道德领导力与维护职场环境 职场领导力提升系列丛书",
                                "//img3m5.ddimg.cn/45/15/29661435-1_l_1701680268.jpg", "管理", 29.50);
                bookRepository.save(book338);
                Book book339 = new Book("创业家思维：成长五力思考法", "［日］平尾丈", "9786825347209", "创业家思维：成长五力思考法",
                                "//img3m5.ddimg.cn/75/36/29662455-1_l_1702448889.jpg", "管理", 29.50);
                bookRepository.save(book339);
                Book book340 = new Book("任正非：除了胜利，我们已无路可走", "周显亮 著", "9780881081022",
                                "任正非：除了胜利，我们已无路可走（新版）（像任正非一样找对方法，积累底气，才能在危机面前保持定力，在看似无路可走时赢得胜利！）",
                                "//img3m6.ddimg.cn/41/24/29657966-1_l_1702017479.jpg", "管理", 26.00);
                bookRepository.save(book340);
                Book book341 = new Book("战略定位：聚合“竞争·商业模式·品牌”定位，为企业成长导航", "李庆丰", "9787624422951",
                                "战略定位：聚合“竞争·商业模式·品牌”定位，为企业成长导航", "//img3m1.ddimg.cn/36/10/29658951-1_l_1702536401.jpg",
                                "管理", 66.30);
                bookRepository.save(book341);
                Book book342 = new Book("沟通：余世维说如何有效沟通", "余世维", "9784639047216", "沟通：余世维说如何有效沟通",
                                "//img3m7.ddimg.cn/90/5/29659797-1_l_1701312411.jpg", "管理", 29.00);
                bookRepository.save(book342);
                Book book343 = new Book("格局：企业做大做强的关键", "臧其超", "9780663337262", "格局：企业做大做强的关键",
                                "//img3m0.ddimg.cn/93/8/29659800-1_l_1701312412.jpg", "管理", 54.00);
                bookRepository.save(book343);
                Book book344 = new Book("小微企业管理课", "贾长松", "9789896098841", "小微企业管理课",
                                "//img3m8.ddimg.cn/35/5/29665088-1_l_1702863863.jpg", "管理", 41.70);
                bookRepository.save(book344);
                Book book345 = new Book("管理铁军", "刘文举", "9784367343864", "管理铁军",
                                "//img3m5.ddimg.cn/42/12/29665095-1_l_1702348192.jpg", "管理", 41.70);
                bookRepository.save(book345);
                Book book346 = new Book("如何撰写商业计划书", "[英] 布赖恩芬奇 著", "9787766722643", "如何撰写商业计划书（第七版）",
                                "//img3m8.ddimg.cn/48/10/29666388-1_l_1703409695.jpg", "管理", 36.00);
                bookRepository.save(book346);
                Book book347 = new Book("数字化转型策划方略与实施全案：数字经济时代下的传统企业数字化转型，转向何方，如何转，转什么", "柴磊   著   华夏智库   出品",
                                "9780850823462",
                                "数字化转型策划方略与实施全案：数字经济时代下的传统企业数字化转型，转向何方，如何转，转什么",
                                "//img3m3.ddimg.cn/64/11/29654623-1_l_1701223926.jpg",
                                "管理", 46.90);
                bookRepository.save(book347);
                Book book348 = new Book("数据科学商业实战：全面讲解商业领域中的数据处理、机器学习和人工智能", "［美］菲尔德·卡迪 (Field Cady)", "9781217769508",
                                "数据科学商业实战：全面讲解商业领域中的数据处理、机器学习和人工智能",
                                "//img3m9.ddimg.cn/75/36/29655129-1_l_1701152785.jpg", "管理",
                                39.50);
                bookRepository.save(book348);
                Book book349 = new Book("投诉是礼物：如何赢得客户的满意和忠诚", "[美]贾内尔·巴洛（Janelle Barlow）", "9787837499757",
                                "投诉是礼物：如何赢得客户的满意和忠诚", "//img3m0.ddimg.cn/7/30/29655160-1_l_1700636672.jpg", "管理",
                                29.50);
                bookRepository.save(book349);
                Book book350 = new Book("结果思维赋能：写给管理者的6个锦囊", "童伯华", "9784545503851", "结果思维赋能：写给管理者的6个锦囊",
                                "//img3m2.ddimg.cn/59/8/29655212-1_l_1700722103.jpg", "管理", 38.00);
                bookRepository.save(book350);
                Book book351 = new Book("企业法务管理从入门到精通", "胡礼新", "9786839547053", "企业法务管理从入门到精通",
                                "//img3m4.ddimg.cn/61/10/29655214-1_l_1700727160.jpg", "管理", 48.40);
                bookRepository.save(book351);
                Book book352 = new Book("领导者的起点：卓越领导者的思考模型和行动指南", "[美]苏珊·G.,施瓦茨（Susan,G.,Schwartz）", "9780036304099",
                                "领导者的起点：卓越领导者的思考模型和行动指南", "//img3m6.ddimg.cn/24/10/29666166-1_l_1702457882.jpg", "管理",
                                34.50);
                bookRepository.save(book352);
                Book book353 = new Book("品牌管理实战入门：一本书讲透品牌管理", "[日]上条宪二", "9783855667284", "品牌管理实战入门：一本书讲透品牌管理",
                                "//img3m4.ddimg.cn/82/31/29666224-1_l_1702460273.jpg", "管理", 64.00);
                bookRepository.save(book353);
                Book book354 = new Book("平台战略：搭建智能平台的七个步骤", "[芬]特罗,·奥耶佩拉（Tero,Ojanper?）,[芬]蒂莫·O.,沃里,[Timo,O.,Vuori]",
                                "9789432932561", "平台战略：搭建智能平台的七个步骤",
                                "//img3m1.ddimg.cn/80/17/29666321-1_l_1702536633.jpg", "管理",
                                39.50);
                bookRepository.save(book354);
                Book book355 = new Book("品质至美：意大利品牌卓越的秘密", "[意],里卡尔多·意利（Riccardo,Illy）", "9787136465873",
                                "品质至美：意大利品牌卓越的秘密",
                                "//img3m3.ddimg.cn/92/29/29666333-1_l_1702536604.jpg", "管理", 34.50);
                bookRepository.save(book355);
                Book book356 = new Book("手机短视频全攻略：策划+脚本+拍摄+剪辑+运营+直播+带货", "彭程", "9788594689641",
                                "手机短视频全攻略：策划+脚本+拍摄+剪辑+运营+直播+带货",
                                "//img3m1.ddimg.cn/9/13/29664171-1_l_1702367168.jpg", "管理", 38.00);
                bookRepository.save(book356);
                Book book357 = new Book("销售精英实战手册：销售技巧+数据处理与分析", "杨小丽", "9787290735232", "销售精英实战手册：销售技巧+数据处理与分析",
                                "//img3m8.ddimg.cn/65/14/29655218-1_l_1700727090.jpg", "管理", 67.40);
                bookRepository.save(book357);
                Book book358 = new Book("从0到N 以商业设计驱动科技商业化实操指南", "李东", "9780430940053", "从0到N 以商业设计驱动科技商业化实操指南",
                                "//img3m6.ddimg.cn/20/25/29660816-1_l_1701828979.jpg", "管理", 63.30);
                bookRepository.save(book358);
                Book book359 = new Book("精益创业实战 原书第3版", "[美]阿什·莫瑞亚（Ash Maurya）", "9781612529363", "精益创业实战 原书第3版",
                                "//img3m3.ddimg.cn/68/4/29655023-1_l_1700557797.jpg", "管理", 82.00);
                bookRepository.save(book359);
                Book book360 = new Book("中国创投简史 第二版", "投资界网站", "9783176216833", "中国创投简史 第二版",
                                "//img3m5.ddimg.cn/9/6/29665755-1_l_1702436264.jpg", "管理", 52.30);
                bookRepository.save(book360);
                Book book361 = new Book("股权激励与分配机制实战：薪酬绩效＋激励方案＋合伙人裂变＋股权管理", "王美江", "9787842938487",
                                "股权激励与分配机制实战：薪酬绩效＋激励方案＋合伙人裂变＋股权管理",
                                "//img3m7.ddimg.cn/11/8/29665757-1_l_1702884351.jpg", "管理", 67.30);
                bookRepository.save(book361);
                Book book362 = new Book("供应链网络设计与优化", "秦璐", "9789083832739", "供应链网络设计与优化",
                                "//img3m4.ddimg.cn/18/15/29665764-1_l_1702884345.jpg", "管理", 67.30);
                bookRepository.save(book362);
                Book book363 = new Book("直播间实战 搭建+拍摄+剪辑+复盘全攻略", "吴炜  神龙工作室", "9789624657555", "直播间实战 搭建+拍摄+剪辑+复盘全攻略",
                                "//img3m3.ddimg.cn/86/12/29666723-1_l_1702958259.jpg", "管理", 52.30);
                bookRepository.save(book363);
                Book book364 = new Book("西方大观念", "陈嘉映  主编", "9780652636307", "西方大观念",
                                "//img3m2.ddimg.cn/19/18/29523502-1_l_2.jpg", "哲学宗教", 298.00);
                bookRepository.save(book364);
                Book book365 = new Book("古希腊思想通识课：修昔底德篇", "张新刚 著", "9789928789204", "古希腊思想通识课：修昔底德篇",
                                "//img3m0.ddimg.cn/70/17/29533750-1_l_3.jpg", "哲学宗教", 34.00);
                bookRepository.save(book365);
                Book book366 = new Book("活出生命的终极意义", "（美）维克多·E.弗兰克尔（Viktor E. Frankl）", "9781125815922", "活出生命的终极意义",
                                "//img3m5.ddimg.cn/15/4/29553495-1_l_5.jpg", "哲学宗教", 59.30);
                bookRepository.save(book366);
                Book book367 = new Book("理想国", "柏拉图 著；郭斌和 张竹明 译", "9785137260732", "理想国（商务印书馆汉译名著权威全译本，精装典藏版）",
                                "//img3m8.ddimg.cn/49/13/28989328-1_l_4.jpg", "哲学宗教", 34.00);
                bookRepository.save(book367);
                Book book368 = new Book("及格家宣言", "[美]雷?贝内特 著 译 周安迪", "9780109018182", "及格家宣言",
                                "//img3m7.ddimg.cn/23/36/29128397-1_l_9.jpg", "哲学宗教", 28.50);
                bookRepository.save(book368);
                Book book369 = new Book("陈果：好的孤独", "陈果  著；读客文化 出品", "9783940817853", "陈果：好的孤独（好的孤独，是一种自我对话；学会如何与自己相处）",
                                "//img3m5.ddimg.cn/35/7/24248105-1_l_10.jpg", "哲学宗教", 18.00);
                bookRepository.save(book369);
                Book book370 = new Book("20世纪思想史：从弗洛伊德到互联网", "[英国] 彼得·沃森 著；张凤，杨阳 译", "9785533396363",
                                "20世纪思想史：从弗洛伊德到互联网（与《思想史》合成一部完备的人类思想全史！全学科覆盖！ 彼得·沃森全面解读20世纪！ ）",
                                "//img3m6.ddimg.cn/25/5/27931786-1_l_11.jpg", "哲学宗教", 124.00);
                bookRepository.save(book370);
                Book book371 = new Book("厚黑学全集", "李宗吾 著   创美工厂 出品", "9782179484904",
                                "厚黑学全集（足本典藏版，林语堂、南怀瑾、柏杨、李敖历经沉浮，感悟作序）",
                                "//img3m4.ddimg.cn/5/14/23270054-1_l_15.jpg", "哲学宗教", 14.90);
                bookRepository.save(book371);
                Book book372 = new Book("庄子的世界   2019年度央视中国好", "王景琳，徐匋 著", "9786220484240", "庄子的世界   2019年度央视中国好书",
                                "//img3m2.ddimg.cn/79/18/28480102-1_l_5.jpg", "哲学宗教", 53.90);
                bookRepository.save(book372);
                Book book373 = new Book("次第花开 修订版", "希阿荣博堪布", "9781680056037", "次第花开 修订版",
                                "//img3m4.ddimg.cn/67/33/24184084-1_l_9.jpg", "哲学宗教", 19.90);
                bookRepository.save(book373);
                Book book374 = new Book("一个瑜伽行者的自传", "帕拉宏撒·尤迦南达 ，阳光博客 出品", "9780034867824",
                                "一个瑜伽行者的自传（一位与美国总统、甘地、泰戈尔倾心交流的圣人，乔布斯每年都会重读一遍，全球19种语言，畅销百万册的现代灵性书籍的经典之作，60周年纪念版全文译本！）",
                                "//img3m1.ddimg.cn/16/7/22583401-1_l_3.jpg", "哲学宗教", 24.90);
                bookRepository.save(book374);
                Book book375 = new Book("禅者的初心", "铃木俊隆", "9784135161317", "禅者的初心（珍藏版）",
                                "//img3m4.ddimg.cn/85/24/23725534-1_l_4.jpg", "哲学宗教", 17.50);
                bookRepository.save(book375);
                Book book376 = new Book("长短经", "（唐）赵蕤　著 ,李孝国　等译", "9785713362553", "长短经（又名《反经》，全注全译全三册）",
                                "//img3m5.ddimg.cn/35/19/23050205-1_l_8.jpg", "哲学宗教", 44.10);
                bookRepository.save(book376);
                Book book377 = new Book("论语译注", "杨伯峻 译注", "9788585855086", "论语译注（简体精装本）",
                                "//img3m3.ddimg.cn/7/21/26436373-1_l_2.jpg", "哲学宗教", 19.50);
                bookRepository.save(book377);
                Book book378 = new Book("果麦经典：了凡四训", "袁了凡 著，译者 费勇，果麦文化 出品", "9783951334288",
                                "果麦经典：了凡四训（“我命由我不由天！”曾国藩、胡适、稻盛和夫推崇的生活方式手册；费勇教授精美译文）",
                                "//img3m9.ddimg.cn/10/24/25157989-1_l_1703241250.jpg", "哲学宗教", 16.00);
                bookRepository.save(book378);
                Book book379 = new Book("诗人哲学家——从帕斯卡尔到马尔库", "周国平", "9782243714814", "诗人哲学家——从帕斯卡尔到马尔库塞",
                                "//img3m2.ddimg.cn/52/1/28992202-1_l_4.jpg", "哲学宗教", 54.60);
                bookRepository.save(book379);
                Book book380 = new Book("新世界:灵性的觉醒(全球销量700万", "（德）艾克哈特.托尔　著；张德芬　译", "9787784741633",
                                "新世界:灵性的觉醒(全球销量700万册，《遇见未知的自己》作者张德芬译作)", "//img3m8.ddimg.cn/94/26/20309548-1_l_1.jpg",
                                "哲学宗教", 15.40);
                bookRepository.save(book380);
                Book book381 = new Book("存在与时间", "海德格尔 著；陈嘉映 王庆节 译", "9787487381570",
                                "存在与时间（陈嘉映教授译，商务印书馆汉译名著权威全译本，精装典藏版）",
                                "//img3m0.ddimg.cn/40/7/28990210-1_l_6.jpg", "哲学宗教", 44.00);
                bookRepository.save(book381);
                Book book382 = new Book("如何阅读哲学家：十堂课读懂哲学大", "约翰·D.卡普托", "9787444556010", "如何阅读哲学家：十堂课读懂哲学大师 （套装4册）",
                                "//img3m0.ddimg.cn/41/14/29318000-1_l_5.jpg", "哲学宗教", 87.50);
                bookRepository.save(book382);
                Book book383 = new Book("樊登推荐 思想实验：当哲学遇见科", "（英）乔尔·利维（Joel Levy） 著", "9784620293417",
                                "樊登推荐 思想实验：当哲学遇见科学",
                                "//img3m6.ddimg.cn/36/35/26919126-1_l_7.jpg", "哲学宗教", 19.90);
                bookRepository.save(book383);
                Book book384 = new Book("工作的意义", "提摩太?凯勒  凯瑟琳?阿尔斯多夫著 潘乔 李怡棉 译", "9786486232357", "工作的意义",
                                "//img3m0.ddimg.cn/76/11/24057670-1_l_7.jpg", "哲学宗教", 31.20);
                bookRepository.save(book384);
                Book book385 = new Book("金刚经说什么", "南怀瑾", "9788599760154", "金刚经说什么",
                                "//img3m8.ddimg.cn/19/17/27878518-1_l_4.jpg", "哲学宗教", 26.00);
                bookRepository.save(book385);
                Book book386 = new Book("人生的智慧：如何幸福度过一生", "[德] 阿图尔·叔本华 著，作家榜经典名著 出品，木云、林求是 译", "9786960668610",
                                "人生的智慧：如何幸福度过一生（全新修订精装珍藏版！叔本华代表作，被誉为幸福指南的哲学入门课，让你活出新自我）作家榜经典文库",
                                "//img3m8.ddimg.cn/48/10/26516208-1_l_87.jpg", "哲学宗教", 19.00);
                bookRepository.save(book386);
                Book book387 = new Book("见识城邦·透过佛法看世界：给寻找", "希阿荣博堪布", "9787723421503", "见识城邦·透过佛法看世界：给寻找答案的人",
                                "//img3m7.ddimg.cn/65/28/23531177-1_l_11.jpg", "哲学宗教", 25.80);
                bookRepository.save(book387);
                Book book388 = new Book("人生大事，真管用的还是哲学", "罗翔 等，果麦文化 出品", "9783732626564",
                                "人生大事，真管用的还是哲学（戴建业、刘擎、罗翔等十位名师，为你解读孔子、柏拉图、尼采等哲学家的经典著作）",
                                "//img3m7.ddimg.cn/17/16/29666357-1_l_1702536273.jpg", "哲学宗教", 24.90);
                bookRepository.save(book388);
                Book book389 = new Book("亚里士多德传 追寻真理的一生", "(希) 塔索斯·阿帕斯托利迪斯，果麦文化 出品", "9785761910287",
                                "亚里士多德传 追寻真理的一生（古希腊版《人类群星闪耀时》再现传奇的图像史诗）",
                                "//img3m5.ddimg.cn/25/12/29655475-1_l_1701078974.jpg", "哲学宗教",
                                49.00);
                bookRepository.save(book389);
                Book book390 = new Book("论语今解 全本全注全译 精义导读 国学大师唐翼明70年研读心得 一版再版 附孔子经典语录 精装彩插", "唐翼明 诠解", "9782739960770",
                                "论语今解 全本全注全译 精义导读 国学大师唐翼明70年研读心得 一版再版 附孔子经典语录 精装彩插",
                                "//img3m4.ddimg.cn/74/7/29661464-1_l_1702631996.jpg", "哲学宗教", 42.10);
                bookRepository.save(book390);
                Book book391 = new Book("功利主义", "[英]约翰·穆勒，果麦文化  出品", "9782219252524",
                                "功利主义（罗翔推荐！追求快乐+摆脱痛苦+实现前两者的手段=功利主义。）",
                                "//img3m8.ddimg.cn/36/3/29664198-1_l_1702286335.jpg", "哲学宗教", 16.40);
                bookRepository.save(book391);
                Book book392 = new Book("科学与假设(精装)", "彭加勒", "9786261620980", "科学与假设(精装)",
                                "//img3m5.ddimg.cn/40/13/29654995-1_l_1701242596.jpg", "哲学宗教", 37.40);
                bookRepository.save(book392);
                Book book393 = new Book("哲学有什么用？", "[英]伯特兰·罗素；读客文化 出品", "9785412040806",
                                "哲学有什么用？（哲学对日常的意义，是帮你理解身边事物的关系与本质！罗素剑桥任教时创作的哲学导论！）（读客三个圈经典文库）",
                                "//img3m8.ddimg.cn/58/1/29664418-1_l_1702031041.jpg", "哲学宗教", 14.95);
                bookRepository.save(book393);
                Book book394 = new Book("思想与自身存在(当代德国哲学前沿丛书)", "迪特·亨里希", "9788389476418", "思想与自身存在(当代德国哲学前沿丛书)",
                                "//img3m4.ddimg.cn/7/6/29662684-1_l_1702608157.jpg", "哲学宗教", 49.00);
                bookRepository.save(book394);
                Book book395 = new Book("与自己和解: 做自己的心灵疗愈师，活得通透自如，认知觉醒一句顶一万句", "余襄子", "9786239238629",
                                "与自己和解: 做自己的心灵疗愈师，活得通透自如，认知觉醒一句顶一万句",
                                "//img3m5.ddimg.cn/75/17/29660475-1_l_1702080236.jpg", "哲学宗教",
                                40.70);
                bookRepository.save(book395);
                Book book396 = new Book("人类思想发展史——关于古代近东思辨思想的讨论(二十世纪人文译丛)", "亨利?法兰克弗特", "9786647559309",
                                "人类思想发展史——关于古代近东思辨思想的讨论(二十世纪人文译丛)",
                                "//img3m2.ddimg.cn/79/1/29658202-1_l_1702891351.jpg", "哲学宗教",
                                105.00);
                bookRepository.save(book396);
                Book book397 = new Book("风流去", "鲍鹏山", "9780243456468", "风流去（新版）",
                                "//img3m4.ddimg.cn/33/33/29659344-1_l_1701242633.jpg", "哲学宗教", 72.00);
                bookRepository.save(book397);
                Book book398 = new Book("中国思想：朱熹与王阳明", "杨天石 著", "9789877520958", "中国思想：朱熹与王阳明（杨天石文集）",
                                "//img3m6.ddimg.cn/11/13/29659916-1_l_1701749556.jpg", "哲学宗教", 99.30);
                bookRepository.save(book398);
                Book book399 = new Book("汪晖对话集", "汪晖", "9785166247209", "汪晖对话集",
                                "//img3m5.ddimg.cn/95/0/29660495-1_l_1701771020.jpg", "哲学宗教", 74.00);
                bookRepository.save(book399);
                Book book400 = new Book("乾坤藏史策：", "郎宝如", "9788833660356", "乾坤藏史策：（周易）密码解锁",
                                "//img3m8.ddimg.cn/11/8/29654768-1_l_1700477894.jpg", "哲学宗教", 46.90);
                bookRepository.save(book400);
                Book book401 = new Book("通向哲学的后楼梯(新版）", "[德] 威廉·魏施德  后浪", "9785872165286", "通向哲学的后楼梯(新版）",
                                "//img3m8.ddimg.cn/73/28/29657008-1_l_1700727097.jpg", "哲学宗教", 36.00);
                bookRepository.save(book401);
                Book book402 = new Book("资本主义的幸存：生产关系的再生产", "[法]亨利·列斐伏尔 著，米兰 译", "9785346493846",
                                "资本主义的幸存：生产关系的再生产（第3版）",
                                "//img3m8.ddimg.cn/22/10/29666758-1_l_1702542510.jpg", "哲学宗教", 54.80);
                bookRepository.save(book402);
                Book book403 = new Book("气本与神化：张载哲学述论 博雅撷英 杨立华作品集", "杨立华 著", "9782632660234",
                                "气本与神化：张载哲学述论 博雅撷英 杨立华作品集",
                                "//img3m1.ddimg.cn/72/18/29650671-1_l_1701853720.jpg", "哲学宗教", 60.40);
                bookRepository.save(book403);
                Book book404 = new Book("哲学的门槛：8堂极简哲学课", "[英]奈杰尔·沃伯顿", "9780029771785", "哲学的门槛：8堂极简哲学课",
                                "//img3m3.ddimg.cn/89/13/29655143-1_l_1701069027.jpg", "哲学宗教", 40.30);
                bookRepository.save(book404);
                Book book405 = new Book("执中致和——中华传统生活智慧(中华传统中文化研究丛书)", "鹿林", "9780255712491",
                                "执中致和——中华传统生活智慧(中华传统中文化研究丛书)",
                                "//img3m7.ddimg.cn/94/16/29658217-1_l_1702624582.jpg", "哲学宗教", 105.00);
                bookRepository.save(book405);
                Book book406 = new Book("以正震之：春秋经传的政治哲学及其历史影响", "李若晖", "9781155659862", "以正震之：春秋经传的政治哲学及其历史影响",
                                "//img3m1.ddimg.cn/98/20/29658221-1_l_1702624791.jpg", "哲学宗教", 85.40);
                bookRepository.save(book406);
                Book book407 = new Book("质料先天与人格生成：对舍勒现象学的质料价值伦理学的重构", "张任之", "9788664020916",
                                "质料先天与人格生成：对舍勒现象学的质料价值伦理学的重构（修订版）(中国现象学文库·现象学研究丛书)",
                                "//img3m4.ddimg.cn/86/32/29661674-1_l_1702608153.jpg", "哲学宗教", 82.80);
                bookRepository.save(book407);
                Book book408 = new Book("中国审美理论", "朱志荣", "9787467419842", "中国审美理论（第五版）",
                                "//img3m8.ddimg.cn/63/19/29660958-1_l_1701848640.jpg", "哲学宗教", 65.90);
                bookRepository.save(book408);
                Book book409 = new Book("思考，让人成为人：人类思想的起源", "[加]杰里米·卡彭代尔（Jeremy Carpendale）[英]查理·刘易斯（Charlie Lewis）",
                                "9782017367697", "思考，让人成为人：人类思想的起源",
                                "//img3m9.ddimg.cn/55/9/29664019-1_l_1703232719.jpg", "哲学宗教",
                                44.50);
                bookRepository.save(book409);
                Book book410 = new Book("中国哲学智慧", "储昭华 主编", "9785935309374", "中国哲学智慧",
                                "//img3m0.ddimg.cn/4/8/29656840-1_l_1700792022.jpg", "哲学宗教", 78.30);
                bookRepository.save(book410);
                Book book411 = new Book("实验医学研究导论(汉译名著本)", "[法]克.贝纳尔", "9786537364839", "实验医学研究导论(汉译名著本)",
                                "//img3m0.ddimg.cn/30/17/29655480-1_l_1701239572.jpg", "哲学宗教", 21.10);
                bookRepository.save(book411);
                Book book412 = new Book("社会批判理论纪事", "张一兵", "9784996116051", "社会批判理论纪事（第15辑）",
                                "//img3m0.ddimg.cn/64/30/29652940-1_l_1700996432.jpg", "哲学宗教", 50.70);
                bookRepository.save(book412);
                Book book413 = new Book("成唯识论校释", "[唐] 玄奘 著", "9782752272195", "成唯识论校释（中国佛教典籍选刊）",
                                "//img3m0.ddimg.cn/28/12/29658250-1_l_1701565909.jpg", "哲学宗教", 82.80);
                bookRepository.save(book413);
                Book book414 = new Book("周易浅述", "(清) 陈梦雷撰 ; 郑同点校", "9787415213393", "周易浅述",
                                "//img3m8.ddimg.cn/0/30/29664558-1_l_1702164836.jpg", "哲学宗教", 58.50);
                bookRepository.save(book414);
                Book book415 = new Book("“崩溃的逻辑”的历史建构:阿多诺早中期哲学思想的文本学解读", "张亮", "9786302253719",
                                "“崩溃的逻辑”的历史建构:阿多诺早中期哲学思想的文本学解读",
                                "//img3m9.ddimg.cn/5/3/29655059-1_l_1700794472.jpg", "哲学宗教", 72.00);
                bookRepository.save(book415);
                Book book416 = new Book("<<实践论>> <<矛盾论>>导读(增订版)马克思主义经典著作导读丛书", "刘敬东、张玲玲", "9781150041945",
                                "<<实践论>> <<矛盾论>>导读(增订版)马克思主义经典著作导读丛书",
                                "//img3m6.ddimg.cn/21/30/29651016-1_l_1700557901.jpg", "哲学宗教",
                                17.70);
                bookRepository.save(book416);
                Book book417 = new Book("《道德经》纵横谈", "崔童鹿，花聚会", "9787728048774", "《道德经》纵横谈",
                                "//img3m1.ddimg.cn/27/7/29657061-1_l_1700870278.jpg", "哲学宗教", 34.00);
                bookRepository.save(book417);
                Book book418 = new Book("道家经典导读", "徐华 编著", "9782108472668", "道家经典导读",
                                "//img3m3.ddimg.cn/95/13/29660693-1_l_1701655681.jpg", "哲学宗教", 33.70);
                bookRepository.save(book418);
                Book book419 = new Book("神话学文库·古代近东历史编撰学中的神话与政治", "[意]马里奥·利维拉尼 著，金立江 译", "9780085736704",
                                "神话学文库·古代近东历史编撰学中的神话与政治（精装版）", "//img3m0.ddimg.cn/95/14/29660990-1_l_1703235122.jpg",
                                "哲学宗教", 72.00);
                bookRepository.save(book419);
                Book book420 = new Book("不吼不叫的父母话术", "张花艳 著；磨铁文化 出品", "9781837232789", "不吼不叫的父母话术",
                                "//img3m5.ddimg.cn/36/23/29629845-1_l_1700100635.jpg", "亲子家教", 38.40);
                bookRepository.save(book420);
                Book book421 = new Book("小日常", "王 潇 著; 得到图书 出品", "9783191784249", "小日常",
                                "//img3m2.ddimg.cn/90/31/29634552-1_l_1698634369.jpg", "亲子家教", 49.00);
                bookRepository.save(book421);
                Book book422 = new Book("掌控", "刘峰", "9783484632691", "掌控",
                                "//img3m2.ddimg.cn/79/7/29645332-1_l_1698825511.jpg",
                                "亲子家教", 31.90);
                bookRepository.save(book422);
                Book book423 = new Book("依法带娃", "马芳", "9788629552506", "依法带娃",
                                "//img3m0.ddimg.cn/26/10/29636270-1_l_1697509199.jpg", "亲子家教", 26.00);
                bookRepository.save(book423);
                Book book424 = new Book("正面管教(修订版)", "[美] 简·尼尔森", "9782651696986", "正面管教(修订版)",
                                "//img3m0.ddimg.cn/64/6/23990140-1_l_46.jpg", "亲子家教", 19.00);
                bookRepository.save(book424);
                Book book425 = new Book("王芳", "王芳", "9782945160643", "王芳",
                                "//img3m2.ddimg.cn/78/13/24057672-1_l_1688430016.jpg", "亲子家教", 29.00);
                bookRepository.save(book425);
                Book book426 = new Book("半小时漫画青春期：生理篇", "陈磊·半小时漫画团队 著；读客文化 出品", "9780331529807",
                                "半小时漫画青春期：生理篇（从变声长痘到脸红心跳，笑着笑着解决青春期困扰！爆笑全解生理知识）",
                                "//img3m8.ddimg.cn/32/5/29277698-1_l_1698106243.jpg",
                                "亲子家教", 24.50);
                bookRepository.save(book426);
                Book book427 = new Book("漫画小学生时间管理", "读书堂", "9786414072451", "漫画小学生时间管理",
                                "//img3m7.ddimg.cn/49/20/29467597-1_l_6.jpg", "亲子家教", 63.00);
                bookRepository.save(book427);
                Book book428 = new Book("陪孩子写作业+思维导图+专注力训练", "王莉,芮彩琴,王玉印,杨泽", "9788420016238",
                                "陪孩子写作业+思维导图+专注力训练三本（科学解锁学习力，让孩子坐得下来，学得进去。）",
                                "//img3m7.ddimg.cn/65/17/29275157-1_l_6.jpg", "亲子家教",
                                60.90);
                bookRepository.save(book428);
                Book book429 = new Book("你只是看上去在陪孩子写作业 资深", "王莉 著", "9787695756313",
                                "你只是看上去在陪孩子写作业 资深优秀教师告诉你陪什么怎么陪（辅导作业鸡飞狗跳，霸道总裁式带娃行不通了）",
                                "//img3m6.ddimg.cn/66/13/28508106-1_l_10.jpg",
                                "亲子家教", 9.90);
                bookRepository.save(book429);
                Book book430 = new Book("孩子受益一生的专注力训练 以哈佛", "芮彩琴", "9781154515480",
                                "孩子受益一生的专注力训练 以哈佛“优势循环”四步法为基础，更适用于中国家庭的生理、心理、学理三位一体的儿童、青少年专注力训练体系。",
                                "//img3m1.ddimg.cn/72/31/28529991-1_l_4.jpg", "亲子家教", 19.20);
                bookRepository.save(book430);
                Book book431 = new Book("薇娅推荐 陪孩子终身成长", "樊登 著，磨铁文化 出品", "9781966696582", "薇娅推荐 陪孩子终身成长（樊登2020年新书！）",
                                "//img3m0.ddimg.cn/50/21/28529870-1_l_12.jpg", "亲子家教", 46.70);
                bookRepository.save(book431);
                Book book432 = new Book("孩子的品格——写给父母的积极心理", "彭凯平", "9788529011547", "孩子的品格——写给父母的积极心理学",
                                "//img3m7.ddimg.cn/71/34/29274767-1_l_16.jpg", "亲子家教", 38.30);
                bookRepository.save(book432);
                Book book433 = new Book("陪孩子走过初中三年", "刘称莲 著，磨铁文化 出品", "9782625449723", "陪孩子走过初中三年（全新增订版）（新版）（2019版）",
                                "//img3m4.ddimg.cn/94/4/27922054-1_l_4.jpg", "亲子家教", 35.60);
                bookRepository.save(book433);
                Book book434 = new Book("心理营养:林文采博士的亲子教育课", "【马来西亚】林文采 伍娜 青豆书坊 出品", "9781081582371", "心理营养:林文采博士的亲子教育课",
                                "//img3m7.ddimg.cn/9/13/23920587-1_l_1696910408.jpg", "亲子家教", 21.40);
                bookRepository.save(book434);
                Book book435 = new Book("如何培养孩子的社会能力", "[美] 默娜·B.舒尔博士，[美] 特里萨·弗伊·迪吉若尼莫 著；张雪兰 译", "9788966029600",
                                "如何培养孩子的社会能力",
                                "//img3m3.ddimg.cn/74/6/25236263-1_l_24.jpg", "亲子家教", 15.00);
                bookRepository.save(book435);
                Book book436 = new Book("如何培养孩子的社会能力", "[美] 默娜·B.舒尔博士，[美] 特里萨·弗伊·迪吉若尼莫 著；张雪兰 译", "9784630360031",
                                "如何培养孩子的社会能力",
                                "//img3m3.ddimg.cn/74/6/25236263-1_l_24.jpg", "亲子家教", 15.00);
                bookRepository.save(book436);
                Book book437 = new Book("孩子：挑战", "[美]鲁道夫·德雷克斯 [美]薇姬·索尔兹  著", "9783215504280",
                                "孩子：挑战（儿童心理学奠基之作，童书妈妈三川玲作序，朱永新、郝景芳、钱志龙、脱不花推荐）",
                                "//img3m5.ddimg.cn/93/19/29135595-1_l_5.jpg", "亲子家教",
                                39.00);
                bookRepository.save(book437);
                Book book438 = new Book("学前快读800字快乐学习礼盒装", "李锴主编", "9788480559270", "学前快读800字快乐学习礼盒装",
                                "//img3m7.ddimg.cn/1/36/28534177-1_l_9.jpg", "亲子家教", 78.00);
                bookRepository.save(book438);
                Book book439 = new Book("我会独立思考", "[美]安德里亚·戴宾克", "9784947828804", "我会独立思考",
                                "//img3m1.ddimg.cn/20/22/29264321-1_l_14.jpg", "亲子家教", 24.50);
                bookRepository.save(book439);
                Book book440 = new Book("儿童情绪管理", "（荷）伍特·德容", "9789593244527",
                                "儿童情绪管理（超有趣的沉浸式心理互动练习，全面提升孩子的专注力、社交力和情绪自控力）",
                                "//img3m7.ddimg.cn/55/24/29269207-1_l_15.jpg", "亲子家教", 43.40);
                bookRepository.save(book440);
                Book book441 = new Book("孩子，为你自己读书", "徐可夫 著，竹石文化 出品", "9780502738793", "孩子，为你自己读书",
                                "//img3m7.ddimg.cn/25/32/26489257-1_l_16.jpg", "亲子家教", 21.00);
                bookRepository.save(book441);
                Book book442 = new Book("陪孩子走过高中三年", "刘称莲 著，磨铁文化 出品", "9781350975392", "陪孩子走过高中三年（全新增订版）（新版）（2019版）",
                                "//img3m8.ddimg.cn/67/13/27943708-1_l_2.jpg", "亲子家教", 35.60);
                bookRepository.save(book442);
                Book book443 = new Book("童年的秘密", "（意）蒙台梭利 著，单中惠 译 青豆书坊 出品", "9780099152491",
                                "童年的秘密（权威译本 ，蒙台梭利早教经典著作，千万级播放量， 每一个父母必须了解的童年秘密）",
                                "//img3m5.ddimg.cn/67/21/20828875-1_l_10.jpg", "亲子家教",
                                11.40);
                bookRepository.save(book443);
                Book book444 = new Book("卓越", "吴军 著；得到图书 出品", "9784174310424",
                                "卓越（打破教育误区，让孩子不走弯路。文津图书奖得主吴军继《大学之路》后在教育领域沉淀之作）",
                                "//img3m3.ddimg.cn/77/26/29658893-1_l_1701561483.jpg", "亲子家教", 59.00);
                bookRepository.save(book444);
                Book book445 = new Book("猿辅导学会学习2024新版孩子自学自律宝典能带出学校的学习方法", "帅科 马旻 杨成慧", "9787141970775",
                                "猿辅导学会学习2024新版孩子自学自律宝典能带出学校的学习方法", "//img3m4.ddimg.cn/5/27/29658524-1_l_1701757574.jpg",
                                "亲子家教", 49.00);
                bookRepository.save(book445);
                Book book446 = new Book("孩子天生爱学习", "樊登.帆书团队 著，磨铁文化 出品", "9783218513685", "孩子天生爱学习",
                                "//img3m3.ddimg.cn/9/19/29665953-1_l_1703222391.jpg", "亲子家教", 49.00);
                bookRepository.save(book446);
                Book book447 = new Book("读出思考力：用阅读开启孩子的高阶思维", "高莉", "9786885197783", "读出思考力：用阅读开启孩子的高阶思维",
                                "//img3m5.ddimg.cn/31/11/29657065-1_l_1702439745.jpg", "亲子家教", 29.90);
                bookRepository.save(book447);
                Book book448 = new Book("7招成为学习高手：引导孩子爱上学习", "丁娜  王巍  著", "9787804588422", "7招成为学习高手：引导孩子爱上学习",
                                "//img3m8.ddimg.cn/43/8/29659948-1_l_1701326911.jpg", "亲子家教", 19.80);
                bookRepository.save(book448);
                Book book449 = new Book("真希望妈妈这样和我说话", "花卷妈（杨洋）", "9784730749439", "真希望妈妈这样和我说话",
                                "//img3m2.ddimg.cn/64/1/29662642-1_l_1701851774.jpg", "亲子家教", 49.20);
                bookRepository.save(book449);
                Book book450 = new Book("数学是怎样学好的", "王金战，余中华", "9782899987600", "数学是怎样学好的（初中版）",
                                "//img3m9.ddimg.cn/46/16/29665099-1_l_1702348204.jpg", "亲子家教", 41.70);
                bookRepository.save(book450);
                Book book451 = new Book("学习可以很快乐 马库斯·波恩森 吴连镐 著 走进名师的奇迹课堂，一窥丹麦教育真谛，让孩子在快乐中爱上学习 亲子家教 家庭教育书籍 中信出版社",
                                "马库斯·波恩森 吴连镐",
                                "9782078694732",
                                "学习可以很快乐 马库斯·波恩森 吴连镐 著 走进名师的奇迹课堂，一窥丹麦教育真谛，让孩子在快乐中爱上学习 亲子家教 家庭教育书籍 中信出版社",
                                "//img3m7.ddimg.cn/53/34/29661047-1_l_1701835251.jpg", "亲子家教", 33.40);
                bookRepository.save(book451);
                Book book452 = new Book("唤醒孩子的自驱力", "梁幻馨", "9786024165536", "唤醒孩子的自驱力",
                                "//img3m0.ddimg.cn/55/1/29657980-1_l_1701163218.jpg", "亲子家教", 29.50);
                bookRepository.save(book452);
                Book book453 = new Book("目标感+父母的期望 儿童心理学家威廉戴蒙 套装", "[美]威廉·戴蒙", "9788242382245",
                                "目标感+父母的期望 儿童心理学家威廉戴蒙 套装（全两册）解决父母宠溺孩子的焦虑症，解决青少年健康发展问题）",
                                "//img3m3.ddimg.cn/82/26/29657413-1_l_1700816634.jpg", "亲子家教", 62.00);
                bookRepository.save(book453);
                Book book454 = new Book("孩子来了：如何度过最艰难的育儿时刻", "马梦捷", "9780042018690", "孩子来了：如何度过最艰难的育儿时刻",
                                "//img3m1.ddimg.cn/91/6/29663461-1_l_1701934808.jpg", "亲子家教", 34.50);
                bookRepository.save(book454);
                Book book455 = new Book("不强势的勇气 如何控制你的控制欲", "何圣君", "9784293517940", "不强势的勇气 如何控制你的控制欲",
                                "//img3m9.ddimg.cn/14/6/29656949-1_l_1701160813.jpg", "亲子家教", 49.20);
                bookRepository.save(book455);
                Book book456 = new Book("帮助孩子克服读写障碍", "[美]丹尼尔·富兰克林/著 王钰靓/译", "9783399894931", "帮助孩子克服读写障碍",
                                "//img3m4.ddimg.cn/55/20/29652634-1_l_1702353870.jpg", "亲子家教", 24.90);
                bookRepository.save(book456);
                Book book457 = new Book("真希望从我6岁起，父母能理解这些事", "劳拉·弗勒利希 著", "9784774229881", "真希望从我6岁起，父母能理解这些事",
                                "//img3m3.ddimg.cn/64/22/29661553-1_l_1702536591.jpg", "亲子家教", 37.90);
                bookRepository.save(book457);
                Book book458 = new Book("小学6年，如何正确陪孩子写作业", "郑婷", "9786204046334", "小学6年，如何正确陪孩子写作业",
                                "//img3m9.ddimg.cn/63/14/29666799-1_l_1702546079.jpg", "亲子家教", 24.90);
                bookRepository.save(book458);
                Book book459 = new Book("培养孩子高效的学习习惯", "岳志兵", "9783446818064", "培养孩子高效的学习习惯",
                                "//img3m2.ddimg.cn/66/17/29666802-1_l_1702546092.jpg", "亲子家教", 24.90);
                bookRepository.save(book459);
                Book book460 = new Book("好妈妈要及早告诉女儿的事", "邓馨", "9780617081883", "好妈妈要及早告诉女儿的事",
                                "//img3m8.ddimg.cn/34/14/29657068-1_l_1700820540.jpg", "亲子家教", 24.90);
                bookRepository.save(book460);
                Book book461 = new Book("整本书阅读如何做", "〔美〕阿里尔·萨克斯 ，黎娜 译", "9789860357226", "整本书阅读如何做",
                                "//img3m0.ddimg.cn/73/36/29666710-1_l_1702951666.jpg", "亲子家教", 103.50);
                bookRepository.save(book461);
                Book book462 = new Book("孩子粗心大意，妈妈怎么办？", "鲁鹏程", "9783575340696", "孩子粗心大意，妈妈怎么办？",
                                "//img3m8.ddimg.cn/92/25/29668808-1_l_1703472774.jpg", "亲子家教", 55.60);
                bookRepository.save(book462);
                Book book463 = new Book("", "木紫", "9786527543350", "（全二册）青春期男孩手册+青春期女孩手册 10-18岁心理生理早恋 性教育 叛逆期教育书籍",
                                "//img3m1.ddimg.cn/82/29/29654641-1_l_1701222007.jpg", "亲子家教", 31.80);
                bookRepository.save(book463);
                Book book464 = new Book("美国儿童情绪管理训练手册", "（美）劳伦斯·E. 夏皮 罗，（美）扎克·佩塔海勒，（美）安娜·F. 格林沃尔德著，孙晓敏译",
                                "9784513991659",
                                "美国儿童情绪管理训练手册", "//img3m7.ddimg.cn/70/33/29666707-1_l_1702951665.jpg", "亲子家教", 44.80);
                bookRepository.save(book464);
                Book book465 = new Book("超级大脑：孩子六维能力培养指南", "攸佳宁", "9788329496926", "超级大脑：孩子六维能力培养指南",
                                "//img3m1.ddimg.cn/88/22/29669101-1_l_1703062798.jpg", "亲子家教", 59.20);
                bookRepository.save(book465);
                Book book466 = new Book("被低估的父爱：真希望每个爸爸都读过这本书", "闫鹏", "9781172021475", "被低估的父爱：真希望每个爸爸都读过这本书",
                                "//img3m2.ddimg.cn/16/13/29665762-1_l_1702434612.jpg", "亲子家教", 52.30);
                bookRepository.save(book466);
                Book book467 = new Book("", "宗春山、金琰", "9787211254989", "（全二册）断乳+话里有话  家庭沟通训练手册 宗春山著 亲子相处问题早教书籍",
                                "//img3m8.ddimg.cn/20/22/29663588-1_l_1702460286.jpg", "亲子家教", 74.80);
                bookRepository.save(book467);
                Book book468 = new Book("开在心上的一朵花", "郭淑珍", "9781894649681", "开在心上的一朵花",
                                "//img3m5.ddimg.cn/70/26/29660965-1_l_1701677759.jpg", "亲子家教", 49.40);
                bookRepository.save(book468);
                Book book469 = new Book("真原医", "杨定一 著； 颉腾文化  出品", "9789058892195", "真原医",
                                "//img3m5.ddimg.cn/13/29/29235505-1_l_1702261554.jpg", "保健养生", 59.20);
                bookRepository.save(book469);
                Book book470 = new Book("张至顺道家养生智慧", "金莲田", "9784809210037", "张至顺道家养生智慧",
                                "//img3m7.ddimg.cn/43/36/29452147-1_l_10.jpg", "保健养生", 49.00);
                bookRepository.save(book470);
                Book book471 = new Book("安全变美", "龙笑，果麦文化 出品", "9784210122264", "安全变美",
                                "//img3m7.ddimg.cn/98/18/29584367-1_l_3.jpg", "保健养生", 80.50);
                bookRepository.save(book471);
                Book book472 = new Book("中国居民膳食指南", "中国营养学会", "9788435766210", "中国居民膳食指南（2022）",
                                "//img3m5.ddimg.cn/88/29/29396455-1_l_5.jpg", "保健养生", 56.50);
                bookRepository.save(book472);
                Book book473 = new Book("医路向前巍子给中国人的救护指南", "医路向前巍子", "9780790280714", "医路向前巍子给中国人的救护指南",
                                "//img3m1.ddimg.cn/13/1/29168581-1_l_1701421846.jpg", "保健养生", 53.80);
                bookRepository.save(book473);
                Book book474 = new Book("以普拉提回归生活", "[ 德 ] 约瑟夫·休伯特斯·普拉提 著，吴振巍 译", "9786786714683", "以普拉提回归生活",
                                "//img3m5.ddimg.cn/92/1/29606735-1_l_1694072171.jpg", "保健养生", 89.00);
                bookRepository.save(book474);
                Book book475 = new Book("女孩别怕 所有女性都用得上的安全", "田静·女孩别怕团队", "9786764408863", "女孩别怕 所有女性都用得上的安全经验",
                                "//img3m2.ddimg.cn/45/14/29214252-1_l_22.jpg", "保健养生", 32.30);
                bookRepository.save(book475);
                Book book476 = new Book("李德修三字经派小儿推拿", "李先晓 杨雅茜", "9788181444141", "李德修三字经派小儿推拿",
                                "//img3m4.ddimg.cn/13/17/29235604-1_l_4.jpg", "保健养生", 22.50);
                bookRepository.save(book476);
                Book book477 = new Book("范志红 吃出健康好身材+范志红28天", "范志红", "9787840939141",
                                "范志红 吃出健康好身材+范志红28天减肥记录（套装2册）[精选套装]",
                                "//img3m3.ddimg.cn/91/9/27895123-1_l_8.jpg", "保健养生", 49.00);
                bookRepository.save(book477);
                Book book478 = new Book("饮食术", "（日）牧田善二", "9789678528016",
                                "饮食术（风靡日本的科学饮食教科书，畅销日本80万册，资深医学博士亲授正确饮食术，送给每个人的控糖、减脂健康忠告）",
                                "//img3m7.ddimg.cn/72/15/29133297-1_l_22.jpg", "保健养生", 39.50);
                bookRepository.save(book478);
                Book book479 = new Book("瘦身，重启人生", "珞宁", "9784515271049", "瘦身，重启人生",
                                "//img3m8.ddimg.cn/72/16/29126268-1_l_3.jpg", "保健养生", 44.20);
                bookRepository.save(book479);
                Book book480 = new Book("范冰冰推荐 轻断食：正在横扫全球", "[英]麦克尔·莫斯利 咪咪·史宾赛 ;读客文化 出品", "9788750066309",
                                "范冰冰推荐 轻断食：正在横扫全球的瘦身革命（新版）", "//img3m4.ddimg.cn/31/3/27878134-1_l_9.jpg", "保健养生",
                                22.50);
                bookRepository.save(book480);
                Book book481 = new Book("孙俪推荐黄帝内经：徐文兵、梁冬对", "徐文兵、梁冬著，紫图图书  出品", "9780546612035",
                                "孙俪推荐黄帝内经：徐文兵、梁冬对话《黄帝内经说什么》（珍藏版套装，全七册）", "//img3m7.ddimg.cn/10/16/29214217-1_l_21.jpg",
                                "保健养生", 204.90);
                bookRepository.save(book481);
                Book book482 = new Book("精神健康讲记：一个中医眼中的心身", "李辛 著", "9789175705989",
                                "精神健康讲记：一个中医眼中的心身调适与精神发展（继李辛医师《儿童健康讲记》后“健康”主题系列的代表作）",
                                "//img3m6.ddimg.cn/69/17/28508406-1_l_6.jpg",
                                "保健养生", 46.80);
                bookRepository.save(book482);
                Book book483 = new Book("人体经络穴位标准大图册", "吴中朝", "9789134173811", "人体经络穴位标准大图册（一本人体经络穴位地图，准确定位，易学速查）",
                                "//img3m5.ddimg.cn/11/6/23525975-1_l_1700704931.jpg", "保健养生", 14.90);
                bookRepository.save(book483);
                Book book484 = new Book("本草纲目：白话手绘彩图典藏本 201", "李时珍 著，凤凰联动 出品", "9782920773707", "本草纲目：白话手绘彩图典藏本 2019新版",
                                "//img3m6.ddimg.cn/65/31/26484446-1_l_4.jpg", "保健养生", 54.00);
                bookRepository.save(book484);
                Book book485 = new Book("肠子的小心思：增订版", "【德】朱莉娅·恩德斯 著，凤凰联动 出品", "9781020214899", "肠子的小心思：增订版（读者选择金奖）",
                                "//img3m7.ddimg.cn/35/26/27891107-1_l_9.jpg", "保健养生", 22.50);
                bookRepository.save(book485);
                Book book486 = new Book("菌群大脑：肠道微生物影响大脑和身", "戴维", "9786373140253", "菌群大脑：肠道微生物影响大脑和身心健康的惊人真相",
                                "//img3m2.ddimg.cn/47/0/26315732-1_l_5.jpg", "保健养生", 32.50);
                bookRepository.save(book486);
                Book book487 = new Book("每个人的战争：抵御癌症的有效生活", "大卫·塞尔旺-施莱伯 著，张俊 译，理想国 出品", "9781662207099",
                                "每个人的战争：抵御癌症的有效生活方式",
                                "//img3m1.ddimg.cn/62/5/25169921-1_l_9.jpg", "保健养生", 33.60);
                bookRepository.save(book487);
                Book book488 = new Book("曲黎敏图说人体自愈妙药-155个穴位", "曲黎敏，陈震宇      凤凰含章  出品", "9785857298220",
                                "曲黎敏图说人体自愈妙药-155个穴位搭配治疗76种疾病，头晕头痛血压高等都不再怕！",
                                "//img3m9.ddimg.cn/72/17/23697999-1_l_1699604443.jpg",
                                "保健养生", 16.80);
                bookRepository.save(book488);
                Book book489 = new Book("只有医生知道", "张羽 著， 凤凰联动 出品", "9780358384489",
                                "只有医生知道（1-3套装）（赠送@协和张羽发给天下女人的一份私信！）[精选套装]",
                                "//img3m5.ddimg.cn/25/36/23816455-1_l_24.jpg", "保健养生", 52.50);
                bookRepository.save(book489);
                Book book490 = new Book("桥本甲状腺炎90天治疗方案", "〔美〕伊莎贝拉·温兹", "9788955087529", "桥本甲状腺炎90天治疗方案（更新版）",
                                "//img3m0.ddimg.cn/48/34/28970220-1_l_6.jpg", "保健养生", 44.85);
                bookRepository.save(book490);
                Book book491 = new Book("曲黎敏精讲<黄帝内经>1+2+3(", "曲黎敏", "9787551408295", "曲黎敏精讲&lt;黄帝内经&gt;1+2+3(套装三册)",
                                "//img3m2.ddimg.cn/11/33/28977212-1_l_6.jpg", "保健养生", 99.70);
                bookRepository.save(book491);
                Book book492 = new Book("3天断糖：吃得丰盛又不胖的断糖减", "(日)西胁俊二", "9783184056018",
                                "3天断糖：吃得丰盛又不胖的断糖减肥方法，日本名医独创，有效预防和改善糖尿病、高血压、痛风、失眠、骨质疏松、动脉硬化等",
                                "//img3m7.ddimg.cn/6/28/29160357-1_l_9.jpg", "保健养生", 22.00);
                bookRepository.save(book492);
                Book book493 = new Book("与病对话：全科医生手记 樊登推荐", "胡冰霜 |乐府文化", "9786744358812", "与病对话：全科医生手记 樊登推荐",
                                "//img3m9.ddimg.cn/62/34/26918459-1_l_6.jpg", "保健养生", 26.00);
                bookRepository.save(book493);
                Book book494 = new Book("学会吃饭", "珍·克里斯特勒、艾莉莎·鲍曼（著） 时代华语 出品", "9782174012874", "学会吃饭（樊登读书创始人樊登博士特别推荐图书）",
                                "//img3m9.ddimg.cn/62/19/27884699-1_l_11.jpg", "保健养生", 24.50);
                bookRepository.save(book494);
                Book book495 = new Book("只有医生知道", "张羽 著， 凤凰联动 出品", "9784602223388",
                                "只有医生知道（1-3套装）（赠送@协和张羽发给天下女人的一份私信！）[精选套装]",
                                "//img3m5.ddimg.cn/25/36/23816455-1_l_24.jpg", "保健养生", 52.50);
                bookRepository.save(book495);
                Book book496 = new Book("救命！逆转和预防致命疾病的科学饮", "（美）Michael Greger（迈克尔?格雷格），Gene Stone（吉恩?斯通）",
                                "9786334050591",
                                "救命！逆转和预防致命疾病的科学饮食", "//img3m6.ddimg.cn/68/6/25307636-1_l_10.jpg", "保健养生", 59.00);
                bookRepository.save(book496);
                Book book497 = new Book("人体使用手册", "吴清忠", "9784049722673", "人体使用手册（2023最新典藏纪念版） 当当独家印签版",
                                "//img3m0.ddimg.cn/43/1/29646880-1_l_1701666979.jpg", "保健养生", 36.00);
                bookRepository.save(book497);
                Book book498 = new Book("漫画黄帝内经：二十四节气+十二时辰养生智慧", "马寅中", "9785843294212", "漫画黄帝内经：二十四节气+十二时辰养生智慧（全两册）",
                                "//img3m7.ddimg.cn/32/24/29656967-1_l_1701839989.jpg", "保健养生", 115.90);
                bookRepository.save(book498);
                Book book499 = new Book("不好意思问闺密，就问刘医生", "刘利芬 著，紫图图书出品", "9783354673083",
                                "不好意思问闺密，就问刘医生（万千女性信赖的妇科医生、医学博士刘利芬首本诚意之作！写给每一位女性的健康枕边书，就像你的专属医生一样随时帮助你。））",
                                "//img3m9.ddimg.cn/3/28/29666739-1_l_1703061655.jpg", "保健养生", 38.40);
                bookRepository.save(book499);
                Book book500 = new Book("心灵择食", "邱锦伶 著,博集天卷 出品", "9780899158211",
                                "心灵择食（增订升级版，明星养生顾问邱锦伶十年精华总结，教你用食物调整心情）",
                                "//img3m4.ddimg.cn/52/16/29652334-1_l_1701668020.jpg", "保健养生", 30.00);
                bookRepository.save(book500);
                Book book501 = new Book("苗医古今方略", "程应凤   著   华夏智库  出品", "9782062467342", "苗医古今方略",
                                "//img3m7.ddimg.cn/26/0/29666267-1_l_1702894306.jpg", "保健养生", 60.70);
                bookRepository.save(book501);
                Book book502 = new Book("屁屁保养指南：笑到飙泪的肛肠健康二三事", "刘峰  后浪", "9780642992512", "屁屁保养指南：笑到飙泪的肛肠健康二三事",
                                "//img3m8.ddimg.cn/57/1/29657388-1_l_1701237055.jpg", "保健养生", 32.50);
                bookRepository.save(book502);
                Book book503 = new Book("运动损伤解剖书", "［澳］布拉德·沃克  后浪", "9787103873403", "运动损伤解剖书（第2版）",
                                "//img3m3.ddimg.cn/87/8/29657913-1_l_1701069725.jpg", "保健养生", 105.20);
                bookRepository.save(book503);
                Book book504 = new Book("百病食疗大全+常用中药养生治病一本通+很老很老的老偏方", "史翔等", "9780745443898",
                                "百病食疗大全+常用中药养生治病一本通+很老很老的老偏方（全3册）图解家庭中医养生保健饮食养生食疗食谱菜谱药膳黄帝内经百科全书",
                                "//img3m6.ddimg.cn/67/6/29659576-1_l_1701561496.jpg", "保健养生", 88.50);
                bookRepository.save(book504);
                Book book505 = new Book(
                                "新版本草纲目中的对症食养方-中医药养生治病一本通 李时珍一看就懂的中医养生保健养生书籍养生食材养生中药治病养生药膳同源 中老年人养生大全 老年人食疗养生方子", "臧俊岐",
                                "9784103889281",
                                "新版本草纲目中的对症食养方-中医药养生治病一本通 李时珍一看就懂的中医养生保健养生书籍养生食材养生中药治病养生药膳同源 中老年人养生大全 老年人食疗养生方子",
                                "//img3m9.ddimg.cn/56/36/29521559-1_l_1.jpg", "保健养生", 29.40);
                bookRepository.save(book505);
                Book book506 = new Book("气形论   (学中医，必学“气一元论”；立足宏观与微观结合，讲述气形一体的生命观，以及从整体到局部把握中医辨证论治之法门。)",
                                "杜风雁, 杜一平, 韩毅",
                                "9784700782329", "气形论   (学中医，必学“气一元论”；立足宏观与微观结合，讲述气形一体的生命观，以及从整体到局部把握中医辨证论治之法门。)",
                                "//img3m0.ddimg.cn/74/24/29662850-1_l_1701835396.jpg", "保健养生", 37.40);
                bookRepository.save(book506);
                Book book507 = new Book("解码乳腺癌：国医大师林毅写给女性的健康书", "司徒红林,文灼彬", "9789613396601", "解码乳腺癌：国医大师林毅写给女性的健康书",
                                "//img3m4.ddimg.cn/36/1/29663604-1_l_1702017430.jpg", "保健养生", 67.30);
                bookRepository.save(book507);
                Book book508 = new Book("免疫：7周免疫力提升方案", "【巴西】里欧·尼索拉（Leo Nissola ）著", "9789977515212", "免疫：7周免疫力提升方案",
                                "//img3m3.ddimg.cn/35/28/29664593-1_l_1702284725.jpg", "保健养生", 59.20);
                bookRepository.save(book508);
                Book book509 = new Book("偏方秘方验方：百病食疗中医养生饮食健康 运动健康中老年养生中医精华黄帝内经大百科本草纲目食疗养生", "丁海静", "9780936896885",
                                "偏方秘方验方：百病食疗中医养生饮食健康 运动健康中老年养生中医精华黄帝内经大百科本草纲目食疗养生",
                                "//img3m9.ddimg.cn/16/12/29658139-1_l_1702186790.jpg", "保健养生", 33.10);
                bookRepository.save(book509);
                Book book510 = new Book("凤凰含章名家养生系列套装", "陈飞松　主编  凤凰含章出品", "9783537646026",
                                "凤凰含章名家养生系列套装（全5册）陈飞松+刘铁军+武国忠+曲黎敏+钟南山",
                                "//img3m5.ddimg.cn/37/19/29657665-1_l_1701681721.jpg", "保健养生",
                                103.10);
                bookRepository.save(book510);
                Book book511 = new Book("科学饮食，拒绝小胖墩儿 孩子健康食谱 常见瘦身食材营养搭配食谱书 科学膳食健康减肥法膳食烹饪食谱书籍健康帮孩子甩掉小肥肉", "陈治锟 李珈贤",
                                "9780808298809", "科学饮食，拒绝小胖墩儿 孩子健康食谱 常见瘦身食材营养搭配食谱书 科学膳食健康减肥法膳食烹饪食谱书籍健康帮孩子甩掉小肥肉",
                                "//img3m6.ddimg.cn/26/1/29644586-1_l_1699495204.jpg", "保健养生", 24.90);
                bookRepository.save(book511);
                Book book512 = new Book("律动八段锦", "许天兴", "9785767620913", "律动八段锦",
                                "//img3m6.ddimg.cn/38/3/29663606-1_l_1702950247.jpg", "保健养生", 29.80);
                bookRepository.save(book512);
                Book book513 = new Book("手足耳穴位按摩", "耿引循", "9784060116307",
                                "手足耳穴位按摩（彩绘图解）推拿按摩入门：百病食疗中医养生中老年养生中医精华黄帝内经大百科本草纲目食疗养生",
                                "//img3m8.ddimg.cn/90/9/29664648-1_l_1702427047.jpg", "保健养生", 46.90);
                bookRepository.save(book513);
                Book book514 = new Book("我长大啦：小学生性教育成长手册", "马迎华", "9786837947763", "我长大啦：小学生性教育成长手册",
                                "//img3m9.ddimg.cn/41/6/29663609-1_l_1702950246.jpg", "保健养生", 22.30);
                bookRepository.save(book514);
                Book book515 = new Book("慢性疾病居家护理手册", "方国美", "9781186969428", "慢性疾病居家护理手册",
                                "//img3m9.ddimg.cn/7/16/29647339-1_l_1700208410.jpg", "保健养生", 33.80);
                bookRepository.save(book515);
                Book book516 = new Book("黄帝内经望诊奇术+奇迹面诊法", "王栋、常虹、三浦直树，紫图图书出品", "9784320428362",
                                "黄帝内经望诊奇术+奇迹面诊法（人的命、运，往往会反映在面相上）",
                                "//img3m1.ddimg.cn/96/31/29651091-1_l_1700031535.jpg", "保健养生",
                                60.00);
                bookRepository.save(book516);
                Book book517 = new Book("老偏方+药酒大全【全2册】家庭中医养生一本通书籍 保健饮食 养生食疗 做自己的中医 养生保健书籍大全 家庭养生保健", "林松生",
                                "9787385589887",
                                "老偏方+药酒大全【全2册】家庭中医养生一本通书籍 保健饮食 养生食疗 做自己的中医 养生保健书籍大全 家庭养生保健",
                                "//img3m5.ddimg.cn/25/32/29661415-1_l_1701829815.jpg", "保健养生", 57.60);
                bookRepository.save(book517);
                Book book518 = new Book("偏方秘方验方+老偏方【全2册】家庭中医养生一本通书籍 保健饮食 养生食疗 做自己的中医 养生保健书籍大全 家庭养生保健", "丁海静",
                                "9785285430834",
                                "偏方秘方验方+老偏方【全2册】家庭中医养生一本通书籍 保健饮食 养生食疗 做自己的中医 养生保健书籍大全 家庭养生保健",
                                "//img3m6.ddimg.cn/26/33/29661416-1_l_1701844676.jpg", "保健养生", 57.60);
                bookRepository.save(book518);
                Book book519 = new Book("偏方秘方验方+老偏方+药酒大全【全3册】家庭中医养生一本通书籍 保健饮食 养生食疗 做自己的中医 养生保健书籍大全 家庭养生保健", "丁海静",
                                "9783020604182", "偏方秘方验方+老偏方+药酒大全【全3册】家庭中医养生一本通书籍 保健饮食 养生食疗 做自己的中医 养生保健书籍大全 家庭养生保健",
                                "//img3m7.ddimg.cn/27/34/29661417-1_l_1701911878.jpg", "保健养生", 86.40);
                bookRepository.save(book519);
                Book book520 = new Book("连接课:与中小学学科课程并重的一门课", "（美）道格·莱莫夫，希拉里·刘易斯，达瑞尔·威廉姆斯，德纳留斯·弗雷泽；中青文 出品",
                                "9785446269815",
                                "连接课:与中小学学科课程并重的一门课（有战略性地设计与开展连接课，深度连接学生与学生、学生与教师、学生与学校）",
                                "//img3m6.ddimg.cn/30/15/29654886-1_l_1700635310.jpg", "保健养生", 37.40);
                bookRepository.save(book520);
                Book book521 = new Book("曲黎敏+陈飞松+武国忠+刘铁军", "曲黎敏、陈飞松等   凤凰含章出品", "9786270616110",
                                "曲黎敏+陈飞松+武国忠+刘铁军（全4册）赠送挂图",
                                "//img3m4.ddimg.cn/57/0/29660754-1_l_1701681722.jpg", "保健养生", 88.80);
                bookRepository.save(book521);
                Book book522 = new Book("写给女生的健康书", "田中友也", "9789516364165", "写给女生的健康书",
                                "//img3m5.ddimg.cn/78/11/29657805-1_l_1702348229.jpg", "保健养生", 33.10);
                bookRepository.save(book522);
                Book book523 = new Book("无器械高强度间歇训练手册 视频学习版", "凌占一", "9786664350774", "无器械高强度间歇训练手册 视频学习版",
                                "//img3m4.ddimg.cn/91/4/29659204-1_l_1701828959.jpg", "保健养生", 29.80);
                bookRepository.save(book523);
                Book book524 = new Book("10分钟手足耳对症按摩正版 准确找穴经络穴位按摩家用养生书籍图解手法中医养生推拿按摩手法图人体经络穴位图解书籍", "沈卫东",
                                "9787335476526",
                                "10分钟手足耳对症按摩正版 准确找穴经络穴位按摩家用养生书籍图解手法中医养生推拿按摩手法图人体经络穴位图解书籍",
                                "//img3m7.ddimg.cn/52/18/29663917-1_l_1702164852.jpg", "保健养生", 21.00);
                bookRepository.save(book524);
                Book book525 = new Book("中医按摩大全 家用养生书籍大全图解手法中医养生书籍推拿按摩书籍手法穴位图 中医古籍出版社", "杨莉", "9784846351304",
                                "中医按摩大全 家用养生书籍大全图解手法中医养生书籍推拿按摩书籍手法穴位图 中医古籍出版社",
                                "//img3m9.ddimg.cn/54/20/29663919-1_l_1702165018.jpg",
                                "保健养生", 29.50);
                bookRepository.save(book525);
                Book book526 = new Book("药膳汤膳粥膳 家庭实用百科全书食疗食谱疗法饮粥膳补养大全四季养生食补食疗中华中医百病食物寒凉温热书籍畅销书排行榜", "褚四红",
                                "9780323821278",
                                "药膳汤膳粥膳 家庭实用百科全书食疗食谱疗法饮粥膳补养大全四季养生食补食疗中华中医百病食物寒凉温热书籍畅销书排行榜",
                                "//img3m2.ddimg.cn/57/23/29663922-1_l_1702165021.jpg", "保健养生", 29.50);
                bookRepository.save(book526);
                Book book527 = new Book("自我中医调理大全 调节脏腑贯通气血 中医自学入门 中医基础理论知识诊断全书 人体经络按摩推拿书籍偏方药材大全", "周宇", "9781321801378",
                                "自我中医调理大全 调节脏腑贯通气血 中医自学入门 中医基础理论知识诊断全书 人体经络按摩推拿书籍偏方药材大全",
                                "//img3m3.ddimg.cn/58/24/29663923-1_l_1702165017.jpg", "保健养生", 29.50);
                bookRepository.save(book527);
                Book book528 = new Book("桩修：站桩的生命智慧", "余功保", "9786325512916", "桩修：站桩的生命智慧",
                                "//img3m3.ddimg.cn/24/18/29657553-1_l_1701065981.jpg", "保健养生", 166.50);
                bookRepository.save(book528);
                Book book529 = new Book("半小时漫画中国地理", "陈磊·半小时漫画团队；读客文化 出品", "9784699706689",
                                "半小时漫画中国地理（从长江长城到黄山黄河，半小时尽览祖国大好河山！）",
                                "//img3m8.ddimg.cn/94/18/29618518-1_l_1692948250.jpg", "科技",
                                24.90);
                bookRepository.save(book529);
                Book book530 = new Book("生命密码3：瘟疫传，尹烨著", "尹烨", "9786378566263", "生命密码3：瘟疫传，尹烨著",
                                "//img3m6.ddimg.cn/18/4/29380446-1_l_4.jpg", "科技", 50.70);
                bookRepository.save(book530);
                Book book531 = new Book("昆虫：古老的地球之王", "[英] 玛丽安·泰勒 著；杨雪 译；中国国家地理·图书  出品", "9780382333897", "昆虫：古老的地球之王",
                                "//img3m3.ddimg.cn/54/23/29521953-1_l_3.jpg", "科技", 39.00);
                bookRepository.save(book531);
                Book book532 = new Book("谢耳朵漫画.物理大爆炸.基础篇", "李剑龙", "9782236182156", "谢耳朵漫画.物理大爆炸.基础篇（全7册）",
                                "//img3m7.ddimg.cn/75/28/29572167-1_l_1701774233.jpg", "科技", 139.00);
                bookRepository.save(book532);
                Book book533 = new Book("写给地球人的《三体》说明书(当当", "齐锐", "9786913515855", "写给地球人的《三体》说明书(当当专享签章）",
                                "//img3m1.ddimg.cn/78/12/29632461-1_l_1696935123.jpg", "科技", 69.00);
                bookRepository.save(book533);
                Book book534 = new Book("茶杯里的风暴：用日常之物揭开万物", "（英）海伦·切尔斯基", "9782923895871", "茶杯里的风暴：用日常之物揭开万物之理",
                                "//img3m7.ddimg.cn/86/34/25350917-1_l_10.jpg", "科技", 34.00);
                bookRepository.save(book534);
                Book book535 = new Book("荒野之声：地球音乐的繁盛和寂灭(", "[美]戴维·乔治·哈斯凯尔（David George Haskell）著  熊姣 译",
                                "9782526965148",
                                "荒野之声：地球音乐的繁盛和寂灭(自然文库)  第四届坪山自然博物图书奖十本评委会推荐图书 商务印书馆",
                                "//img3m4.ddimg.cn/0/28/29517444-1_l_2.jpg", "科技",
                                67.60);
                bookRepository.save(book535);
                Book book536 = new Book("深奥的简洁", "【英】约翰·格里宾 著 马自恒 时代华语 出品", "9782166484054", "深奥的简洁（樊登博士亲自视频解读）",
                                "//img3m6.ddimg.cn/72/27/28495836-1_l_13.jpg", "科技", 26.00);
                bookRepository.save(book536);
                Book book537 = new Book("华为数字化转型之道 华为官方出品", "华为企业架构与变革管理部  著", "9780321103611", "华为数字化转型之道 华为官方出品",
                                "//img3m9.ddimg.cn/45/34/29399679-1_l_43.jpg", "科技", 71.00);
                bookRepository.save(book537);
                Book book538 = new Book("矩阵力量：线性代数全彩图解+微课+", "姜伟生", "9786679784274", "矩阵力量：线性代数全彩图解+微课+Python编程",
                                "//img3m7.ddimg.cn/15/7/29580027-1_l_3.jpg", "科技", 129.00);
                bookRepository.save(book538);
                Book book539 = new Book("利用Python进行数据分析", "[美]韦斯·麦金尼（Wes McKinney）", "9785044213876",
                                "利用Python进行数据分析（原书第2版）",
                                "//img3m7.ddimg.cn/3/33/25312917-1_l_1700626661.jpg", "科技", 65.50);
                bookRepository.save(book539);
                Book book540 = new Book("R语言实战", "[美]罗伯特 · I. 卡巴科弗（Robert I. Kabacoff）", "9787872460538", "R语言实战（第3版）",
                                "//img3m5.ddimg.cn/77/21/29580485-1_l_1.jpg", "科技", 59.90);
                bookRepository.save(book540);
                Book book541 = new Book("Python数据结构与算法分析", "[美] 布拉德利", "9786268133469", "Python数据结构与算法分析（第3版）",
                                "//img3m4.ddimg.cn/34/13/29623804-1_l_1693974476.jpg", "科技", 49.90);
                bookRepository.save(book541);
                Book book542 = new Book("小学生C++趣味编程", "潘洪波", "9783356804591", "小学生C++趣味编程",
                                "//img3m0.ddimg.cn/68/18/25201310-1_l_6.jpg", "科技", 40.70);
                bookRepository.save(book542);
                Book book543 = new Book("完全图解计算机网络原理 计算机入", "基恩 著", "9781845036768",
                                "完全图解计算机网络原理 计算机入门书籍图书 计算机程序设计艺术 深入浅出计算机网络",
                                "//img3m6.ddimg.cn/18/36/29580426-1_l_2.jpg", "科技", 39.90);
                bookRepository.save(book543);
                Book book544 = new Book("Python青少年趣味编程全彩版 独家", "张彦 编著", "9786613077226",
                                "Python青少年趣味编程全彩版 独家配备71集视频教学课程 手机扫码看视频 少儿编程 小学生趣味编程 教孩子学编程 少儿c++",
                                "//img3m0.ddimg.cn/95/23/28524470-1_l_4.jpg", "科技", 31.40);
                bookRepository.save(book544);
                Book book545 = new Book("这就是ChatGPT！揭开AIGC神秘面纱", "[美] 斯蒂芬·沃尔弗拉姆（Stephen Wolfram）", "9786799892866",
                                "这就是ChatGPT！揭开AIGC神秘面纱！OpenAI CEO 山姆·阿尔特曼（Sam Altman）强烈推荐！",
                                "//img3m6.ddimg.cn/85/4/29595046-1_l_1689314072.jpg", "科技", 29.90);
                bookRepository.save(book545);
                Book book546 = new Book("人工智能：现代方法", "[美]斯图尔特·罗素（Stuart Russell）", "9787976574650",
                                "人工智能：现代方法（第4版）（上下册）",
                                "//img3m2.ddimg.cn/47/23/29483732-1_l_13.jpg", "科技", 99.00);
                bookRepository.save(book546);
                Book book547 = new Book("ChatGPT时代：ChatGPT全能应用一本", "江涵丰", "9787610144331",
                                "ChatGPT时代：ChatGPT全能应用一本通 ChatGPT实战宝典+实操指南",
                                "//img3m5.ddimg.cn/44/20/29564315-1_l_7.jpg", "科技", 44.20);
                bookRepository.save(book547);
                Book book548 = new Book("深度学习   人工智能算法，机器学",
                                "[美]Ian Goodfellow（伊恩·古德费洛）、[加]Yoshua Bengio（约书亚·本吉奥）、[加]Aaron Courville（亚伦·库维尔）",
                                "9784149208602",
                                "深度学习   人工智能算法，机器学习奠基之作，AI圣经", "//img3m2.ddimg.cn/32/0/25111382-1_l_11.jpg", "科技",
                                84.00);
                bookRepository.save(book548);
                Book book549 = new Book("人工智能从小白到大神 chatgpt聊天", "刘鹏 曹骝 吴彩云 张燕 编著", "9784307936743",
                                "人工智能从小白到大神 chatgpt聊天机器人 美国AAAS院士清华大学智能科学讲席教授张亚勤百度技术委员会理事长陈尚义联袂推荐 istio自动机器学习深度学习强化学习",
                                "//img3m2.ddimg.cn/35/23/29142962-1_l_11.jpg", "科技", 40.40);
                bookRepository.save(book549);
                Book book550 = new Book("硅基物语.AI大爆炸：ChatGPT—AIGC", "量子学派@ChatGPT", "9787174465576",
                                "硅基物语.AI大爆炸：ChatGPT—AIGC—GPT-X—AGI进化—魔法时代—人类未来",
                                "//img3m4.ddimg.cn/78/5/29571774-1_l_1690531934.jpg",
                                "科技", 66.70);
                bookRepository.save(book550);
                Book book551 = new Book("硅基物语 AI写作高手：从零开始用C", "无戒,杜培培,俞庚言 著", "9781295145782",
                                "硅基物语 AI写作高手：从零开始用ChatGPT学会写作 看清AI写作逻辑 讲透AI写作之道",
                                "//img3m5.ddimg.cn/11/11/29626355-1_l_1702863847.jpg",
                                "科技", 44.20);
                bookRepository.save(book551);
                Book book552 = new Book("秒懂AI提问：让人工智能成为你的效", "秋叶   刘进新   姜梅   定秋枫", "9782120898705",
                                "秒懂AI提问：让人工智能成为你的效率神器",
                                "//img3m9.ddimg.cn/88/36/29599999-1_l_1692082725.jpg", "科技", 29.90);
                bookRepository.save(book552);
                Book book553 = new Book("内证观察笔记：真图本中医解剖学纲", "无名氏 述", "9783752722390", "内证观察笔记：真图本中医解剖学纲目（增订本）",
                                "//img3m4.ddimg.cn/73/9/29003014-1_l_5.jpg", "科技", 27.60);
                bookRepository.save(book553);
                Book book554 = new Book("中医特效处方大全", "李淳  编著", "9785053335583", "中医特效处方大全",
                                "//img3m3.ddimg.cn/67/11/29455933-1_l_1696837881.jpg", "科技", 51.00);
                bookRepository.save(book554);
                Book book555 = new Book("黄煌经方使用手册·", "黄煌", "9787732132254", "黄煌经方使用手册·（第四版）",
                                "//img3m6.ddimg.cn/9/19/28534086-1_l_2.jpg", "科技", 36.30);
                bookRepository.save(book555);
                Book book556 = new Book("图解本草纲目", "（明）李时珍著，健康大学堂编委会  编著", "9780322609532",
                                "图解本草纲目（《本草纲目》图解版本，畅销百万册图解经典系列全新修订，忠于原著！中国中医科学院研究员陈飞松、中国医术专业委员会专家于雅婷联袂审订推荐！看懂中国药典，就选这本！）",
                                "//img3m2.ddimg.cn/74/6/23342492-1_l_1702542492.jpg", "科技", 27.20);
                bookRepository.save(book556);
                Book book557 = new Book("李可老中医急危重症疑难病经验专辑", "李可", "9783957544667", "李可老中医急危重症疑难病经验专辑",
                                "//img3m1.ddimg.cn/84/6/29321211-1_l_3.jpg", "科技", 24.50);
                bookRepository.save(book557);
                Book book558 = new Book("中医临床丛书·金匮要略", "张仲景", "9784567941907", "中医临床丛书·金匮要略",
                                "//img3m1.ddimg.cn/77/20/9034421-1_l_3.jpg", "科技", 7.90);
                bookRepository.save(book558);
                Book book559 = new Book("黄帝内经素问", "人民卫生出版社", "9780788011634", "黄帝内经素问",
                                "//img3m4.ddimg.cn/9/15/22642794-1_l_3.jpg", "科技", 26.30);
                bookRepository.save(book559);
                Book book560 = new Book("四圣心源·清代名医黄元御系列", "清黄元御（著），孙熙洽（校注）", "9786543409975", "四圣心源·清代名医黄元御系列",
                                "//img3m0.ddimg.cn/33/23/27868830-1_l_5.jpg", "科技", 14.60);
                bookRepository.save(book560);
                Book book561 = new Book("医学的温度", "韩启德", "9780803355002", "医学的温度（2020年中国好书、第十六届文津图书奖）",
                                "//img3m8.ddimg.cn/44/33/29143268-1_l_12.jpg", "科技", 26.80);
                bookRepository.save(book561);
                Book book562 = new Book("协和内科住院医师手册", "施文,沈恺妮", "9781391700533", "协和内科住院医师手册（第三版）",
                                "//img3m2.ddimg.cn/38/22/29269982-1_l_5.jpg", "科技", 60.00);
                bookRepository.save(book562);
                Book book563 = new Book("ICD11精神、行为与神经发育障碍临", "王振,黄晶晶", "9783582382986", "ICD11精神、行为与神经发育障碍临床描述与诊断指南",
                                "//img3m7.ddimg.cn/65/6/29634527-1_l_1697442915.jpg", "科技", 123.90);
                bookRepository.save(book563);
                Book book564 = new Book("儿科手记 : 一个中医奶爸的碎碎念", "范怨武著", "9780031587268", "儿科手记 : 一个中医奶爸的碎碎念",
                                "//img3m2.ddimg.cn/84/32/29449812-1_l_7.jpg", "科技", 42.00);
                bookRepository.save(book564);
                Book book565 = new Book("森田疗法指导-神经症克服法", "[日] 高良武久 著，王祖承，陆谢森，陈幼寅 译", "9788317402861", "森田疗法指导-神经症克服法",
                                "//img3m7.ddimg.cn/13/0/23970487-1_l_1696748444.jpg", "科技", 28.60);
                bookRepository.save(book565);
                Book book566 = new Book("协和急诊住院医师手册", "朱华栋,刘业成", "9785378460731", "协和急诊住院医师手册",
                                "//img3m1.ddimg.cn/4/23/29302321-1_l_3.jpg", "科技", 54.40);
                bookRepository.save(book566);
                Book book567 = new Book("奈特人体解剖学彩色图谱，第8版", "张卫光", "9780833423887", "奈特人体解剖学彩色图谱，第8版",
                                "//img3m1.ddimg.cn/80/30/29644541-1_l_1699337925.jpg", "科技", 272.90);
                bookRepository.save(book567);
                Book book568 = new Book("临床急救医学", "美] （美）斯科特·谢尔曼 等，吴晓，胡善友，常庆 ... 译", "9783236619444", "临床急救医学",
                                "//img3m0.ddimg.cn/14/10/26511620-1_l_3.jpg", "科技", 81.00);
                bookRepository.save(book568);
                Book book569 = new Book("新型电力系统与新型能源体系", "辛保安", "9784316579009", "新型电力系统与新型能源体系（助力能源电力高质量发展）",
                                "//img3m6.ddimg.cn/91/3/29633266-1_l_1701237057.jpg", "科技", 89.10);
                bookRepository.save(book569);
                Book book570 = new Book("电工基础", "邱勇进", "9781982879129", "电工基础",
                                "//img3m2.ddimg.cn/72/23/24018462-1_l_5.jpg",
                                "科技", 24.00);
                bookRepository.save(book570);
                Book book571 = new Book("一本书搞懂无人机", "刘宾，籍莉  编著", "9782044563208", "一本书搞懂无人机",
                                "//img3m0.ddimg.cn/25/20/26482030-1_l_2.jpg", "科技", 24.50);
                bookRepository.save(book571);
                Book book572 = new Book("教你成为一流电工", "王泽金  编", "9788152827645", "教你成为一流电工",
                                "//img3m1.ddimg.cn/92/8/29385371-1_l_7.jpg", "科技", 29.00);
                bookRepository.save(book572);
                Book book573 = new Book("图解新能源汽车原理与构造", "张金柱  主编", "9789574367856", "图解新能源汽车原理与构造",
                                "//img3m1.ddimg.cn/22/14/29576371-1_l_3.jpg", "科技", 49.50);
                bookRepository.save(book573);
                Book book574 = new Book("图解汽车原理与构造", "张金柱 主编", "9788864741888", "图解汽车原理与构造（彩色版）",
                                "//img3m3.ddimg.cn/33/7/23962983-1_l_2.jpg", "科技", 34.50);
                bookRepository.save(book574);
                Book book575 = new Book("安全生产事故调查与案例分析", "吕淑然，车广杰  编著", "9789947656556", "安全生产事故调查与案例分析（第二版）",
                                "//img3m2.ddimg.cn/53/25/28544822-1_l_6.jpg", "科技", 39.00);
                bookRepository.save(book575);
                Book book576 = new Book("智能化战争：AI军事畅想", "吴明曦", "9787800616020",
                                "智能化战争：AI军事畅想（学习强国，重磅推荐）人工智能 揭示未来战争趋势与走向",
                                "//img3m9.ddimg.cn/67/11/28510879-1_l_1697593442.jpg", "科技", 69.00);
                bookRepository.save(book576);
                Book book577 = new Book("半小时漫画中国地理2", "陈磊·半小时漫画团队；读客文化 出品", "9781188700418",
                                "半小时漫画中国地理2（假如全中国是个班级，地理知识就很好记，四川、重庆、湖南、湖北，越看越爱国！）混子哥新作半小时漫画文库",
                                "//img3m4.ddimg.cn/2/16/29667134-1_l_1702981571.jpg", "科技", 34.40);
                bookRepository.save(book577);
                Book book578 = new Book("我们在非洲", "非洲的青山 著", "9785817571967", "我们在非洲",
                                "//img3m8.ddimg.cn/64/8/29661058-1_l_1703317057.jpg", "科技", 73.50);
                bookRepository.save(book578);
                Book book579 = new Book("蘑菇猎人：北美野生蘑菇的地下世界(自然文库)", "[美]兰登·库克", "9781127727827", "蘑菇猎人：北美野生蘑菇的地下世界(自然文库)",
                                "//img3m2.ddimg.cn/85/36/29655832-1_l_1701139543.jpg", "科技", 57.40);
                bookRepository.save(book579);
                Book book580 = new Book("新知文库164·第一只狗：我们最古老的伙伴", "[美国]帕特·希普曼", "9782391929047", "新知文库164·第一只狗：我们最古老的伙伴",
                                "//img3m6.ddimg.cn/42/24/29664996-1_l_1702286290.jpg", "科技", 36.80);
                bookRepository.save(book580);
                Book book581 = new Book("大话科学史", "[美]山姆·基恩 著，左安浦 译，未读 出品", "9787528272379",
                                "大话科学史（全三册）：比悬疑小说更好看的真实科学史，科普故事大王、《元素的盛宴》作者山姆·基恩作品集",
                                "//img3m8.ddimg.cn/17/19/29667248-1_l_1703213390.jpg", "科技", 131.70);
                bookRepository.save(book581);
                Book book582 = new Book("大转型：中世纪晚期的气候、疾病、社会与现代世界的形成", "布鲁斯·M. S. 坎贝尔（Bruce M. S. Campbell）",
                                "9785777688439",
                                "大转型：中世纪晚期的气候、疾病、社会与现代世界的形成", "//img3m6.ddimg.cn/7/20/29549626-1_l_1702292395.jpg",
                                "科技", 88.50);
                bookRepository.save(book582);
                Book book583 = new Book("树的呼吸 世界知名的森林守护人、《树的秘密生命》作者彼得·渥雷本全新力作！感受森林的一呼一吸，向树木学习如何生活。中信出版社", "彼得?渥雷本",
                                "9788631397386", "树的呼吸 世界知名的森林守护人、《树的秘密生命》作者彼得·渥雷本全新力作！感受森林的一呼一吸，向树木学习如何生活。中信出版社",
                                "//img3m0.ddimg.cn/40/35/29650540-1_l_1700736595.jpg", "科技", 39.60);
                bookRepository.save(book583);
                Book book584 = new Book("外星探访指南", "[澳] 丽莎·哈维·史密斯 著 ， [澳] 特雷西·格里姆伍德 绘，刘小鸥 译，未读 出品", "9788994707877",
                                "外星探访指南",
                                "//img3m6.ddimg.cn/93/34/29660196-1_l_1701846009.jpg", "科技", 39.90);
                bookRepository.save(book584);
                Book book585 = new Book("自然老师没教的事", "张蕙芬", "9780240844985", "自然老师没教的事（自然观察丛书）",
                                "//img3m8.ddimg.cn/43/16/29654998-1_l_1700798160.jpg", "科技", 58.30);
                bookRepository.save(book585);
                Book book586 = new Book("群鸟嘤嘤：法国皇家植物园鸟类图鉴", "［法］布封    后浪", "9789661755351", "群鸟嘤嘤：法国皇家植物园鸟类图鉴",
                                "//img3m4.ddimg.cn/37/6/29653804-1_l_1703066026.jpg", "科技", 64.00);
                bookRepository.save(book586);
                Book book587 = new Book("长江的微笑:中国长江江豚保护手记", "王丁 郝玉江 邓正宇", "9789724372358", "长江的微笑:中国长江江豚保护手记",
                                "//img3m0.ddimg.cn/85/3/29657020-1_l_1700724144.jpg", "科技", 31.90);
                bookRepository.save(book587);
                Book book588 = new Book("旅行到时空边缘", "李德范", "9783935246040", "旅行到时空边缘",
                                "//img3m6.ddimg.cn/11/22/29658926-1_l_1701242763.jpg", "科技", 81.40);
                bookRepository.save(book588);
                Book book589 = new Book("树木词典", "琼·马卢夫（Joan Maloof） 著,博集天卷 出品", "9789884823776",
                                "树木词典（以词条形式收录了从A到Z的丰富信息，名副其实的迷你百科全书）",
                                "//img3m5.ddimg.cn/50/34/29661935-1_l_1701743423.jpg", "科技",
                                31.40);
                bookRepository.save(book589);
                Book book590 = new Book("跟着细菌学“肠”识", "布里奥妮·巴尔", "9782621511783", "跟着细菌学“肠”识",
                                "//img3m7.ddimg.cn/63/7/29661057-1_l_1701994302.jpg", "科技", 51.70);
                bookRepository.save(book590);
                Book book591 = new Book("野草:野性之美", "加雷思·理查兹/著，英国皇家园艺学会/编，光合作用/译", "9788468476667", "野草:野性之美（“天际线”丛书）",
                                "//img3m4.ddimg.cn/12/7/29665164-1_l_1702361690.jpg", "科技", 77.40);
                bookRepository.save(book591);
                Book book592 = new Book("鹦鹉螺与长颈鹿:10？章生命的故事", "玛丽安·泰勒 著，王西敏 译", "9780886711115",
                                "鹦鹉螺与长颈鹿:10？章生命的故事（“天际线”丛书）",
                                "//img3m5.ddimg.cn/13/8/29665165-1_l_1702361688.jpg", "科技", 116.90);
                bookRepository.save(book592);
                Book book593 = new Book("心智简史", "熊明宝", "9787520359139", "心智简史",
                                "//img3m7.ddimg.cn/7/31/29655457-1_l_1700618520.jpg", "科技", 51.00);
                bookRepository.save(book593);
                Book book594 = new Book("开采太阳石", "王国法，吴群英，张宏 主编", "9780415710114", "开采太阳石",
                                "//img3m7.ddimg.cn/3/29/29656047-1_l_1700652975.jpg", "科技", 49.00);
                bookRepository.save(book594);
                Book book595 = new Book("发现太阳石", "王国法，吴群英，张宏 主编", "9786069290323", "发现太阳石",
                                "//img3m8.ddimg.cn/4/30/29656048-1_l_1700652971.jpg", "科技", 49.00);
                bookRepository.save(book595);
                Book book596 = new Book("尘封在时间里的生命：探索隐藏在50件化石中的动物故事", "[英] 迪安·洛马克斯（Dean，R.，Lomax） 著，张玉亮 译",
                                "9786816659502",
                                "尘封在时间里的生命：探索隐藏在50件化石中的动物故事", "//img3m6.ddimg.cn/69/22/29663736-1_l_1701934807.jpg",
                                "科技", 59.20);
                bookRepository.save(book596);
                Book book597 = new Book("趣味几何学+中国几何故事(套装共2册）", "（苏）雅科夫·伊西达洛维奇·别莱利曼/著   许莼舫", "9781509625444",
                                "趣味几何学+中国几何故事(套装共2册）", "//img3m2.ddimg.cn/60/28/29668182-1_l_1703125699.jpg", "科技",
                                39.20);
                bookRepository.save(book597);
                Book book598 = new Book("趣味物理学+趣味力学(套装共2册）", "（苏）雅科夫·伊西达洛维奇·别莱利曼/著", "9785738083631",
                                "趣味物理学+趣味力学(套装共2册）",
                                "//img3m3.ddimg.cn/61/29/29668183-1_l_1703069531.jpg", "科技", 32.00);
                bookRepository.save(book598);
                Book book599 = new Book("海陆的起源(彩图珍藏版)科学元典丛书 著名地理学家李旭旦教授译", "【德】魏格纳 著, 李旭旦 译", "9781322662077",
                                "海陆的起源(彩图珍藏版)科学元典丛书 著名地理学家李旭旦教授译", "//img3m4.ddimg.cn/62/8/29654324-1_l_1700549653.jpg",
                                "科技", 103.10);
                bookRepository.save(book599);
                Book book600 = new Book("大家小书译馆 贝克通识文库 太空旅行史", "[德]君特 西法特", "9781128696801", "大家小书译馆 贝克通识文库 太空旅行史",
                                "//img3m9.ddimg.cn/39/11/29669349-1_l_1703123296.jpg", "科技", 33.80);
                bookRepository.save(book600);
                Book book601 = new Book("神奇的氢科学", "丁文江", "9788792560810", "神奇的氢科学",
                                "//img3m3.ddimg.cn/18/11/29660913-1_l_1701760490.jpg", "科技", 47.50);
                bookRepository.save(book601);
                Book book602 = new Book("地理的秘密", "纸上魔方 编绘", "9784513792133", "地理的秘密（让孩子爱上科学实验）",
                                "//img3m9.ddimg.cn/65/9/29661059-1_l_1701475671.jpg", "科技", 37.30);
                bookRepository.save(book602);
                Book book603 = new Book("电磁的魔性", "纸上魔方 编绘", "9788499524153", "电磁的魔性（让孩子爱上科学实验）",
                                "//img3m0.ddimg.cn/66/10/29661060-1_l_1701475670.jpg", "科技", 37.30);
                bookRepository.save(book603);
                Book book604 = new Book("动物真有趣", "纸上魔方 编绘", "9781460562222", "动物真有趣（让孩子爱上科学实验）",
                                "//img3m1.ddimg.cn/67/11/29661061-1_l_1701475672.jpg", "科技", 37.30);
                bookRepository.save(book604);
                Book book605 = new Book("数学游戏", "[西]胡安·迭戈·桑切斯·托雷斯", "9781598492835", "数学游戏",
                                "//img3m2.ddimg.cn/90/10/29661282-1_l_1701760476.jpg", "科技", 33.80);
                bookRepository.save(book605);
                Book book606 = new Book("玩转数字", "[英]安德鲁·杰弗里", "9780127380582", "玩转数字",
                                "//img3m5.ddimg.cn/93/13/29661285-1_l_1701760478.jpg", "科技", 29.50);
                bookRepository.save(book606);
                Book book607 = new Book("爱因斯坦陪审团", "【加】杰弗里·克雷林斯滕", "9786868559515", "爱因斯坦陪审团",
                                "//img3m3.ddimg.cn/19/20/29666953-1_l_1702977344.jpg", "科技", 82.80);
                bookRepository.save(book607);
                Book book608 = new Book("给孩子的气象之书", "中国天气", "9787726463203", "给孩子的气象之书",
                                "//img3m7.ddimg.cn/0/25/29655747-1_l_1700626696.jpg", "科技", 47.50);
                bookRepository.save(book608);
        }
}