package org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lygaeid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02241539\"]}");
	add("{\"term\":\"lygaeid bug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02241539\"]}");
	add("{\"term\":\"lygaeidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02241395\"]}");
	add("{\"term\":\"lyginopteridales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625355\"]}");
	add("{\"term\":\"lyginopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625847\"]}");
	add("{\"term\":\"lygodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12976789\"]}");
	add("{\"term\":\"lygodium microphyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12977348\"]}");
	add("{\"term\":\"lygodium palmatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12977127\"]}");
	add("{\"term\":\"lygus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02240765\"]}");
	add("{\"term\":\"lygus bug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02240887\"]}");
	add("{\"term\":\"lygus lineolaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02241010\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }