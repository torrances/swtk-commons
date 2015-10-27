package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"disease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14093842\"]}");
	add("{\"term\":\"disembarkation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00058822\"]}");
	add("{\"term\":\"disembarkment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00058822\"]}");
	add("{\"term\":\"disembarrassment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07320378\"]}");
	add("{\"term\":\"disembowelment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00671946\"]}");
	add("{\"term\":\"disenchantment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996982\"]}");
	add("{\"term\":\"disenfranchisement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01142350\"]}");
	add("{\"term\":\"disengagement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00058126\", \"00391714\"]}");
	add("{\"term\":\"disentanglement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01247140\"]}");
	add("{\"term\":\"disentangler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10036672\"]}");
	add("{\"term\":\"disequilibrium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13957307\"]}");
	add("{\"term\":\"disestablishment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01084810\"]}");
	add("{\"term\":\"disesteem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14461311\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }