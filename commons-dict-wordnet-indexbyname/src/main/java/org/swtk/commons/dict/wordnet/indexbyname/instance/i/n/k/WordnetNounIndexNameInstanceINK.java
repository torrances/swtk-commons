package org.swtk.commons.dict.wordnet.indexbyname.instance.i.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ink\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05411941\", \"14941786\"]}");
	add("{\"term\":\"ink bottle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03576776\"]}");
	add("{\"term\":\"ink cartridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03576857\"]}");
	add("{\"term\":\"ink eraser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03577004\"]}");
	add("{\"term\":\"inka\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08505843\", \"09746533\"]}");
	add("{\"term\":\"inkberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12778218\"]}");
	add("{\"term\":\"inkblot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04702450\"]}");
	add("{\"term\":\"inkblot test\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01009849\"]}");
	add("{\"term\":\"inkiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04967454\"]}");
	add("{\"term\":\"inking pad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03878563\"]}");
	add("{\"term\":\"inkle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03577258\"]}");
	add("{\"term\":\"inkling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05924900\"]}");
	add("{\"term\":\"inkpad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03878563\"]}");
	add("{\"term\":\"inkpot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03576776\"]}");
	add("{\"term\":\"inkstand\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03577356\", \"03577472\"]}");
	add("{\"term\":\"inkwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03577472\"]}");
	add("{\"term\":\"inky cap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13026744\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }