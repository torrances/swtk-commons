package org.swtk.commons.dict.wordnet.index.name.instance.a.n.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anathema\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07248523\", \"09811566\"]}");
	add("{\"term\":\"anathematisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00207449\"]}");
	add("{\"term\":\"anathematization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00207449\"]}");
	add("{\"term\":\"anatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01848268\"]}");
	add("{\"term\":\"anatolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719756\"]}");
	add("{\"term\":\"anatolian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06988254\"]}");
	add("{\"term\":\"anatomical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07166600\"]}");
	add("{\"term\":\"anatomist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09811678\"]}");
	add("{\"term\":\"anatomy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00647430\", \"05224424\", \"06067070\"]}");
	add("{\"term\":\"anatotitan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01709042\"]}");
	add("{\"term\":\"anatoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15059021\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }