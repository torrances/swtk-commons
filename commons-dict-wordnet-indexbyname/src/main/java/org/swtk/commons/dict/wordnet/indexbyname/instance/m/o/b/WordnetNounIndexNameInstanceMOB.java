package org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mob\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08260983\", \"08263223\", \"08201518\"]}");
	add("{\"term\":\"moban\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03786429\"]}");
	add("{\"term\":\"mobcap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03781700\"]}");
	add("{\"term\":\"mobile\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03781824\", \"09076943\", \"09379536\"]}");
	add("{\"term\":\"mobile bay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09379678\"]}");
	add("{\"term\":\"mobile canteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02956110\"]}");
	add("{\"term\":\"mobile home\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03781993\"]}");
	add("{\"term\":\"mobile phone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02995984\"]}");
	add("{\"term\":\"mobile river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09379536\"]}");
	add("{\"term\":\"mobilisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01158925\", \"01232772\"]}");
	add("{\"term\":\"mobility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04780590\"]}");
	add("{\"term\":\"mobilization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01232772\", \"01158925\"]}");
	add("{\"term\":\"mobius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11203781\"]}");
	add("{\"term\":\"mobius strip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03782206\"]}");
	add("{\"term\":\"mobocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08379229\"]}");
	add("{\"term\":\"mobster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139742\"]}");
	add("{\"term\":\"mobula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01503362\"]}");
	add("{\"term\":\"mobula hypostoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01503495\"]}");
	add("{\"term\":\"mobulidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01502539\"]}");
	add("{\"term\":\"mobuto lake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09352967\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }