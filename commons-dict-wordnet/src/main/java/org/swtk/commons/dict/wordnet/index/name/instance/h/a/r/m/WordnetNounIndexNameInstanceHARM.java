package org.swtk.commons.dict.wordnet.index.name.instance.h.a.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHARM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"harm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00403900\", \"07435370\", \"14309164\"]}");
	add("{\"term\":\"harmattan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11458870\"]}");
	add("{\"term\":\"harmfulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04797984\", \"05173599\"]}");
	add("{\"term\":\"harmonic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04995327\", \"05727751\"]}");
	add("{\"term\":\"harmonica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03499379\"]}");
	add("{\"term\":\"harmonics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06120860\"]}");
	add("{\"term\":\"harmoniousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04720394\", \"04991600\"]}");
	add("{\"term\":\"harmonisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01256365\", \"07040945\"]}");
	add("{\"term\":\"harmoniser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10180005\", \"10180217\"]}");
	add("{\"term\":\"harmonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03499638\"]}");
	add("{\"term\":\"harmonization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01256365\", \"07040945\"]}");
	add("{\"term\":\"harmonizer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10180005\", \"10180217\"]}");
	add("{\"term\":\"harmony\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04991429\", \"07194843\", \"13992690\", \"07040667\", \"04720394\"]}");
	add("{\"term\":\"harmsworth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11049294\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }