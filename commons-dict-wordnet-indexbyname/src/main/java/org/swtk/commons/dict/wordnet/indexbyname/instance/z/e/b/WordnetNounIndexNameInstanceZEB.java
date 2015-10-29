package org.swtk.commons.dict.wordnet.indexbyname.instance.z.e.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZEB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zebibit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13653468\"]}");
	add("{\"term\":\"zebibyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13652973\"]}");
	add("{\"term\":\"zebra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02393701\"]}");
	add("{\"term\":\"zebra crossing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03910302\"]}");
	add("{\"term\":\"zebra finch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01547030\"]}");
	add("{\"term\":\"zebra mussel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01968170\"]}");
	add("{\"term\":\"zebra orchid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12069006\"]}");
	add("{\"term\":\"zebrawood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11766286\", \"11766529\"]}");
	add("{\"term\":\"zebrawood family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11766693\"]}");
	add("{\"term\":\"zebrawood tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11766286\"]}");
	add("{\"term\":\"zebu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02407558\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }