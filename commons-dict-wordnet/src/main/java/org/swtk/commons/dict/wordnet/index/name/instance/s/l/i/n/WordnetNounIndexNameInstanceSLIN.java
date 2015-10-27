package org.swtk.commons.dict.wordnet.index.name.instance.s.l.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSLIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sling\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04246543\", \"04246746\", \"04246893\", \"04247204\", \"07933858\"]}");
	add("{\"term\":\"slingback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04246893\"]}");
	add("{\"term\":\"slinger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10631504\"]}");
	add("{\"term\":\"slinging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00107836\"]}");
	add("{\"term\":\"slingshot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04247204\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }