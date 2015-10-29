package org.swtk.commons.dict.wordnet.indexbyname.instance.v.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vagabond\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10764201\", \"09491367\"]}");
	add("{\"term\":\"vagabondage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00297888\"]}");
	add("{\"term\":\"vagary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07351696\"]}");
	add("{\"term\":\"vagina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05528762\"]}");
	add("{\"term\":\"vaginal artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05363631\"]}");
	add("{\"term\":\"vaginal birth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13469507\"]}");
	add("{\"term\":\"vaginal discharge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14877983\"]}");
	add("{\"term\":\"vaginal smear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05274258\"]}");
	add("{\"term\":\"vaginismus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00371693\"]}");
	add("{\"term\":\"vaginitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14381740\"]}");
	add("{\"term\":\"vaginocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14319193\"]}");
	add("{\"term\":\"vagn walfrid ekman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10975740\"]}");
	add("{\"term\":\"vagrancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13966288\"]}");
	add("{\"term\":\"vagrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10764201\"]}");
	add("{\"term\":\"vagueness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04712187\", \"04831581\"]}");
	add("{\"term\":\"vagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05487728\"]}");
	add("{\"term\":\"vagus nerve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05487728\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }