package org.swtk.commons.dict.wordnet.index.name.instance.m.e.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMESO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mesoamerica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08753397\"]}");
	add("{\"term\":\"mesoamerican\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10330450\"]}");
	add("{\"term\":\"mesoblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01466718\"]}");
	add("{\"term\":\"mesocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11705123\"]}");
	add("{\"term\":\"mesocolon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05436981\"]}");
	add("{\"term\":\"mesocricetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02345839\"]}");
	add("{\"term\":\"mesoderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01466718\"]}");
	add("{\"term\":\"mesohippus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02378787\"]}");
	add("{\"term\":\"mesolithic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15258036\"]}");
	add("{\"term\":\"mesomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10330570\"]}");
	add("{\"term\":\"mesomorphy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006471\"]}");
	add("{\"term\":\"meson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09375179\"]}");
	add("{\"term\":\"mesophyron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05240021\"]}");
	add("{\"term\":\"mesophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13142108\"]}");
	add("{\"term\":\"mesopotamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08936089\"]}");
	add("{\"term\":\"mesosphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09375475\"]}");
	add("{\"term\":\"mesothelioma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14274917\"]}");
	add("{\"term\":\"mesothelium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05248053\"]}");
	add("{\"term\":\"mesotron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09375179\"]}");
	add("{\"term\":\"mesozoic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15151127\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }