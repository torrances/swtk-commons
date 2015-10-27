package org.swtk.commons.dict.wordnet.index.name.instance.t.a.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tape\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03713575\", \"04399200\", \"08701724\", \"04398925\", \"04398656\"]}");
	add("{\"term\":\"tapeline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04399200\"]}");
	add("{\"term\":\"tapenade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07874312\"]}");
	add("{\"term\":\"taper\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02951508\", \"04589115\", \"05078537\", \"13925486\"]}");
	add("{\"term\":\"tapering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00354437\"]}");
	add("{\"term\":\"tapestry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04400491\", \"04400642\", \"04774278\"]}");
	add("{\"term\":\"tapeworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01930097\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }