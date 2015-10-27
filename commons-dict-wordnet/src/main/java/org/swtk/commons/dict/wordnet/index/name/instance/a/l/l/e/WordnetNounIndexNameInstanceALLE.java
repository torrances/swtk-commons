package org.swtk.commons.dict.wordnet.index.name.instance.a.l.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"allegation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06743935\", \"07250737\"]}");
	add("{\"term\":\"allegement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06743935\"]}");
	add("{\"term\":\"alleghenies\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09215586\"]}");
	add("{\"term\":\"allegheny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09215851\"]}");
	add("{\"term\":\"allegiance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04885133\", \"01208643\"]}");
	add("{\"term\":\"allegoriser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09803601\"]}");
	add("{\"term\":\"allegorizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09803601\"]}");
	add("{\"term\":\"allegory\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06378026\", \"06893714\", \"06383718\"]}");
	add("{\"term\":\"allegretto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07053695\", \"15289702\"]}");
	add("{\"term\":\"allegro\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07053516\", \"15289832\"]}");
	add("{\"term\":\"allele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05445361\"]}");
	add("{\"term\":\"allelomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05445361\"]}");
	add("{\"term\":\"allemande\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07856100\"]}");
	add("{\"term\":\"allen\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10834380\", \"10834557\", \"10834717\"]}");
	add("{\"term\":\"allentown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09157700\"]}");
	add("{\"term\":\"allergen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14608440\"]}");
	add("{\"term\":\"allergist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09803747\"]}");
	add("{\"term\":\"allergology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06055776\"]}");
	add("{\"term\":\"allergy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14556418\"]}");
	add("{\"term\":\"alleviant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03885551\"]}");
	add("{\"term\":\"alleviation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00355710\", \"07508420\"]}");
	add("{\"term\":\"alleviator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03885551\", \"09803884\"]}");
	add("{\"term\":\"alley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02885255\", \"02700618\"]}");
	add("{\"term\":\"alleyway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02700618\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }