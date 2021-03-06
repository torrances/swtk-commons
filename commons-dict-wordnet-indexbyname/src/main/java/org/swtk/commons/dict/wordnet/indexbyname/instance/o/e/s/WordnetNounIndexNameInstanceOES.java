package org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oesophageal reflux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14358890\"]}");
	add("{\"term\":\"oesophageal veins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05374155\"]}");
	add("{\"term\":\"oesophagitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14369220\"]}");
	add("{\"term\":\"oesophagogastric junction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05578972\"]}");
	add("{\"term\":\"oesophagoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03301892\"]}");
	add("{\"term\":\"oesophagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05541581\"]}");
	add("{\"term\":\"oesterreich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08864547\"]}");
	add("{\"term\":\"oestradiol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774495\"]}");
	add("{\"term\":\"oestridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02197066\"]}");
	add("{\"term\":\"oestriol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774801\"]}");
	add("{\"term\":\"oestrogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14773973\"]}");
	add("{\"term\":\"oestrone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774961\"]}");
	add("{\"term\":\"oestrus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02197251\", \"14061746\"]}");
	add("{\"term\":\"oestrus ovis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02197402\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }