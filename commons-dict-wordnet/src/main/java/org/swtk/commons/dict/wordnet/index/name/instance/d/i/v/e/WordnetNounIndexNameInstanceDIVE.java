package org.swtk.commons.dict.wordnet.index.name.instance.d.i.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dive\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00327503\", \"00443966\", \"03535983\"]}");
	add("{\"term\":\"diver\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02051742\", \"10039131\", \"10039277\"]}");
	add("{\"term\":\"divergence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04756982\", \"05871886\", \"07380889\", \"01006014\"]}");
	add("{\"term\":\"divergency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01006014\", \"05871886\"]}");
	add("{\"term\":\"diverseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04758560\"]}");
	add("{\"term\":\"diversification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14598725\", \"00196418\"]}");
	add("{\"term\":\"diversion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00977356\", \"00351206\", \"00427931\"]}");
	add("{\"term\":\"diversionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10564305\"]}");
	add("{\"term\":\"diversity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04742951\", \"04758560\"]}");
	add("{\"term\":\"diverticulitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365328\"]}");
	add("{\"term\":\"diverticulosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14055962\"]}");
	add("{\"term\":\"diverticulum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14319331\"]}");
	add("{\"term\":\"divertimento\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07056332\"]}");
	add("{\"term\":\"divestiture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01117338\", \"06552854\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }