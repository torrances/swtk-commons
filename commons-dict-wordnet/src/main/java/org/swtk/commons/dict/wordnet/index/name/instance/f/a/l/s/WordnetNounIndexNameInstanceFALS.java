package org.swtk.commons.dict.wordnet.index.name.instance.f.a.l.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFALS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"falsehood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00752233\", \"06769118\"]}");
	add("{\"term\":\"falseness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04875102\", \"04886287\", \"13983750\"]}");
	add("{\"term\":\"falsetto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05134622\"]}");
	add("{\"term\":\"falsie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03324598\"]}");
	add("{\"term\":\"falsification\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00156118\", \"00752233\", \"00752488\", \"05834793\"]}");
	add("{\"term\":\"falsifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10096737\"]}");
	add("{\"term\":\"falsifying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00156118\"]}");
	add("{\"term\":\"falsity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06769118\", \"13983750\"]}");
	add("{\"term\":\"falstaff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09621924\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }