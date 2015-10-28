package org.swtk.commons.dict.wordnet.indexbyname.instance.k.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03614083\"]}");
	add("{\"term\":\"katabolism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13464960\"]}");
	add("{\"term\":\"katamorphism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13526272\"]}");
	add("{\"term\":\"katar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09009061\", \"09009275\"]}");
	add("{\"term\":\"katari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09747479\"]}");
	add("{\"term\":\"katharevusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06989619\"]}");
	add("{\"term\":\"katharobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13145288\"]}");
	add("{\"term\":\"katharometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03614360\"]}");
	add("{\"term\":\"katharsis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00254262\", \"00254444\"]}");
	add("{\"term\":\"kathmandu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08926582\"]}");
	add("{\"term\":\"katmandu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08926582\"]}");
	add("{\"term\":\"katowice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09006380\"]}");
	add("{\"term\":\"katsina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08996838\"]}");
	add("{\"term\":\"katsuwonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02631678\"]}");
	add("{\"term\":\"katsuwonus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02631486\"]}");
	add("{\"term\":\"kattegatt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09347765\"]}");
	add("{\"term\":\"katydid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02230993\"]}");
	add("{\"term\":\"katzenjammer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07400260\", \"14470631\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }