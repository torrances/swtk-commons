package org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lycaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02284639\"]}");
	add("{\"term\":\"lycaenid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02284439\"]}");
	add("{\"term\":\"lycaenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02284204\"]}");
	add("{\"term\":\"lycaeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02119282\"]}");
	add("{\"term\":\"lycanthrope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09526253\"]}");
	add("{\"term\":\"lycanthropy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05208451\"]}");
	add("{\"term\":\"lycee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08301402\"]}");
	add("{\"term\":\"lyceum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03704057\", \"08301402\"]}");
	add("{\"term\":\"lychee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07782149\"]}");
	add("{\"term\":\"lychgate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03704149\"]}");
	add("{\"term\":\"lychnis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11831942\"]}");
	add("{\"term\":\"lycia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08805730\"]}");
	add("{\"term\":\"lycian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06988747\"]}");
	add("{\"term\":\"lycium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12925480\"]}");
	add("{\"term\":\"lycopene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14745503\"]}");
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