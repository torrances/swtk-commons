package org.swtk.commons.dict.wordnet.index.name.instance.l.y.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYCO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lycopene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14745503\"]}");
	add("{\"term\":\"lycoperdaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13064276\"]}");
	add("{\"term\":\"lycoperdales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13064024\"]}");
	add("{\"term\":\"lycoperdon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13064506\"]}");
	add("{\"term\":\"lycopersicon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12926415\"]}");
	add("{\"term\":\"lycopersicum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12926415\"]}");
	add("{\"term\":\"lycophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13242141\"]}");
	add("{\"term\":\"lycopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13242427\"]}");
	add("{\"term\":\"lycopodiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13243375\"]}");
	add("{\"term\":\"lycopodiales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13243125\"]}");
	add("{\"term\":\"lycopodiate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13241740\"]}");
	add("{\"term\":\"lycopodineae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13242281\"]}");
	add("{\"term\":\"lycopodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13243567\"]}");
	add("{\"term\":\"lycopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13241740\"]}");
	add("{\"term\":\"lycopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12872809\"]}");
	add("{\"term\":\"lycosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01777871\"]}");
	add("{\"term\":\"lycosidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01777559\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }