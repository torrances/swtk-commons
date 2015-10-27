package org.swtk.commons.dict.wordnet.index.name.instance.w.a.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wave\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"10790734\", \"11544884\", \"13891583\", \"05266723\", \"07288732\", \"07367435\", \"07360193\", \"00346921\", \"07366790\"]}");
	add("{\"term\":\"waveband\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06271281\"]}");
	add("{\"term\":\"waveform\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07362264\"]}");
	add("{\"term\":\"wavefront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08699704\"]}");
	add("{\"term\":\"waveguide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04571699\"]}");
	add("{\"term\":\"wavelength\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06218000\", \"05093476\"]}");
	add("{\"term\":\"wavelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07359263\"]}");
	add("{\"term\":\"wavell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11397310\"]}");
	add("{\"term\":\"waver\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00349397\", \"01065274\", \"10790938\"]}");
	add("{\"term\":\"waverer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622936\"]}");
	add("{\"term\":\"wavering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04778150\", \"05707399\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }