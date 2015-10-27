package org.swtk.commons.dict.wordnet.index.name.instance.r.e.f.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREFU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"refueling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01061643\"]}");
	add("{\"term\":\"refuge\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01211087\", \"04078214\", \"05162506\", \"08661508\"]}");
	add("{\"term\":\"refugee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10535609\"]}");
	add("{\"term\":\"refulgence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04961131\"]}");
	add("{\"term\":\"refulgency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04961131\"]}");
	add("{\"term\":\"refund\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01124011\", \"13303184\"]}");
	add("{\"term\":\"refurbishment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14447921\"]}");
	add("{\"term\":\"refusal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06646602\", \"07220233\"]}");
	add("{\"term\":\"refuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14881302\"]}");
	add("{\"term\":\"refutal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00156118\"]}");
	add("{\"term\":\"refutation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00156118\", \"05834793\", \"07215473\"]}");
	add("{\"term\":\"refuter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10530139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }