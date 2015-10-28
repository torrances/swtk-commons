package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15189617\"]}");
	add("{\"term\":\"satan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09566482\"]}");
	add("{\"term\":\"satang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13686038\"]}");
	add("{\"term\":\"satanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05988462\"]}");
	add("{\"term\":\"satanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10571914\"]}");
	add("{\"term\":\"satanophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14409139\"]}");
	add("{\"term\":\"satchel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04144300\"]}");
	add("{\"term\":\"satchmo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10842803\"]}");
	add("{\"term\":\"sateen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04144438\"]}");
	add("{\"term\":\"satellite\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09447148\", \"10572067\", \"04144527\"]}");
	add("{\"term\":\"satiation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01074908\", \"14475617\"]}");
	add("{\"term\":\"satie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11302424\"]}");
	add("{\"term\":\"satiety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14475617\"]}");
	add("{\"term\":\"satin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04145344\"]}");
	add("{\"term\":\"satinet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04145481\"]}");
	add("{\"term\":\"satinette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04145481\"]}");
	add("{\"term\":\"satinleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12794677\"]}");
	add("{\"term\":\"satinpod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11912010\"]}");
	add("{\"term\":\"satinwood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12718275\", \"12718469\", \"12736168\"]}");
	add("{\"term\":\"satire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06790003\"]}");
	add("{\"term\":\"satirist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572170\"]}");
	add("{\"term\":\"satisfaction\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01074489\", \"13371012\", \"13313810\", \"14010164\", \"07546643\"]}");
	add("{\"term\":\"satisfactoriness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04799358\"]}");
	add("{\"term\":\"satisfier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09447367\"]}");
	add("{\"term\":\"satori\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996854\"]}");
	add("{\"term\":\"satrap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572568\"]}");
	add("{\"term\":\"satsuma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07764252\", \"12731337\"]}");
	add("{\"term\":\"saturation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04982607\", \"13948221\", \"00403479\", \"13517720\"]}");
	add("{\"term\":\"saturday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15189617\"]}");
	add("{\"term\":\"satureia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12887584\"]}");
	add("{\"term\":\"satureja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12887584\"]}");
	add("{\"term\":\"saturn\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09581517\", \"09447520\"]}");
	add("{\"term\":\"saturnalia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00512223\", \"00519498\"]}");
	add("{\"term\":\"saturnia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02304434\"]}");
	add("{\"term\":\"saturniid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02304104\"]}");
	add("{\"term\":\"saturniidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02303724\"]}");
	add("{\"term\":\"saturnism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14093377\"]}");
	add("{\"term\":\"satyagraha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01245809\"]}");
	add("{\"term\":\"satyr\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09571240\", \"10572408\"]}");
	add("{\"term\":\"satyriasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07505182\"]}");
	add("{\"term\":\"satyridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02280208\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }