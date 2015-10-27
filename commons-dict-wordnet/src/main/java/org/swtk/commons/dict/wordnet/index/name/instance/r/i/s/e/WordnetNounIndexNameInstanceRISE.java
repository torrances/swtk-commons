package org.swtk.commons.dict.wordnet.index.name.instance.r.i.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRISE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rise\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00365086\", \"05117708\", \"07341888\", \"07362999\", \"05076087\", \"05117485\", \"07460080\", \"09229873\", \"00325210\", \"07339517\"]}");
	add("{\"term\":\"riser\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04101814\", \"04101953\", \"10552133\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }