package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hooch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07902151\"]}");
	add("{\"term\":\"hood\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"01750741\", \"03536090\", \"03536461\", \"03536627\", \"03536726\", \"03536871\", \"03536988\", \"08242255\", \"09328264\", \"10203700\"]}");
	add("{\"term\":\"hoodlum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10203700\"]}");
	add("{\"term\":\"hoodmold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03247298\"]}");
	add("{\"term\":\"hoodmould\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03247298\"]}");
	add("{\"term\":\"hoodoo\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03537260\", \"03609171\", \"10203909\", \"13923748\"]}");
	add("{\"term\":\"hoodooism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06255946\"]}");
	add("{\"term\":\"hooey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06622262\"]}");
	add("{\"term\":\"hoof\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02156785\", \"02156611\"]}");
	add("{\"term\":\"hoofer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10204022\"]}");
	add("{\"term\":\"hoofing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00528732\"]}");
	add("{\"term\":\"hoofprint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06812612\"]}");
	add("{\"term\":\"hook\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00112178\", \"00136619\", \"00573322\", \"03537522\", \"03537852\", \"05703197\", \"13892186\", \"03538099\"]}");
	add("{\"term\":\"hookah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03538194\"]}");
	add("{\"term\":\"hooke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11077920\"]}");
	add("{\"term\":\"hooker\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10204124\", \"10204302\", \"10682754\", \"11078330\", \"11078431\"]}");
	add("{\"term\":\"hooking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00573322\"]}");
	add("{\"term\":\"hooknose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05607256\"]}");
	add("{\"term\":\"hooks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05572825\"]}");
	add("{\"term\":\"hookup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03538666\", \"03538834\"]}");
	add("{\"term\":\"hookworm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14477142\", \"01935792\"]}");
	add("{\"term\":\"hooky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01237177\"]}");
	add("{\"term\":\"hooligan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09898763\"]}");
	add("{\"term\":\"hooliganism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01252403\"]}");
	add("{\"term\":\"hoop\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02805381\", \"04590057\", \"03539152\", \"03539609\"]}");
	add("{\"term\":\"hoopla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07263175\"]}");
	add("{\"term\":\"hoopoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01832510\"]}");
	add("{\"term\":\"hoopoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01832510\"]}");
	add("{\"term\":\"hoops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00482004\"]}");
	add("{\"term\":\"hoopskirt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03539760\"]}");
	add("{\"term\":\"hooray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06705718\"]}");
	add("{\"term\":\"hoosegow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03539875\"]}");
	add("{\"term\":\"hoosgow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03539875\"]}");
	add("{\"term\":\"hoosier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09762347\"]}");
	add("{\"term\":\"hoot\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05148040\", \"07138578\", \"07137263\"]}");
	add("{\"term\":\"hootch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07902151\"]}");
	add("{\"term\":\"hooter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01623768\", \"02764839\", \"05606462\"]}");
	add("{\"term\":\"hoover\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03539956\", \"11078628\", \"11078909\", \"11079074\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }