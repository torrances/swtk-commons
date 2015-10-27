package org.swtk.commons.dict.wordnet.index.name.instance.r.e.t.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRETI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reticence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04659795\"]}");
	add("{\"term\":\"reticle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04089998\"]}");
	add("{\"term\":\"reticulation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04090225\", \"13571958\"]}");
	add("{\"term\":\"reticule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04089998\", \"04090421\"]}");
	add("{\"term\":\"reticulitermes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02226346\"]}");
	add("{\"term\":\"reticulocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05462278\"]}");
	add("{\"term\":\"reticulum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02402300\", \"05509136\", \"09431290\"]}");
	add("{\"term\":\"retina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05434566\"]}");
	add("{\"term\":\"retinal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15029953\"]}");
	add("{\"term\":\"retinene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15029953\"]}");
	add("{\"term\":\"retinitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14378365\"]}");
	add("{\"term\":\"retinoblastoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14274332\"]}");
	add("{\"term\":\"retinol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15114632\"]}");
	add("{\"term\":\"retinopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14280496\"]}");
	add("{\"term\":\"retinue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08446124\"]}");
	add("{\"term\":\"retiree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10545192\"]}");
	add("{\"term\":\"retirement\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00055472\", \"00213054\", \"13977336\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }