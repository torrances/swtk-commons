package org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wad\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07594964\", \"13796604\", \"15137269\"]}");
	add("{\"term\":\"wadding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15001007\"]}");
	add("{\"term\":\"waddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00291250\"]}");
	add("{\"term\":\"waddler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10781732\"]}");
	add("{\"term\":\"wade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11389671\"]}");
	add("{\"term\":\"wader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02003608\"]}");
	add("{\"term\":\"waders\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04550001\"]}");
	add("{\"term\":\"wadi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09497140\"]}");
	add("{\"term\":\"wading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00294151\"]}");
	add("{\"term\":\"wading bird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02003608\"]}");
	add("{\"term\":\"wading pool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04550144\"]}");
	add("{\"term\":\"wads\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13799721\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }