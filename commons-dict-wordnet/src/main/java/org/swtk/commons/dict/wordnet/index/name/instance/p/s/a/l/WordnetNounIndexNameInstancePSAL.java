package org.swtk.commons.dict.wordnet.index.name.instance.p.s.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePSAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"psalm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06478348\", \"06478458\"]}");
	add("{\"term\":\"psalmist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10506948\"]}");
	add("{\"term\":\"psalmody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01258136\"]}");
	add("{\"term\":\"psalms\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06448807\"]}");
	add("{\"term\":\"psalter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06429110\"]}");
	add("{\"term\":\"psalterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02402443\"]}");
	add("{\"term\":\"psaltery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04023240\"]}");
	add("{\"term\":\"psaltriparus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01595533\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }