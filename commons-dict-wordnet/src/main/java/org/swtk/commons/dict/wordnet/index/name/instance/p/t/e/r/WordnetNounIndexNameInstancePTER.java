package org.swtk.commons.dict.wordnet.index.name.instance.p.t.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePTER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pteretis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13218698\"]}");
	add("{\"term\":\"pteridaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13226380\"]}");
	add("{\"term\":\"pteridium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13210554\"]}");
	add("{\"term\":\"pteridologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509915\"]}");
	add("{\"term\":\"pteridology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06084163\"]}");
	add("{\"term\":\"pteridophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11565220\"]}");
	add("{\"term\":\"pteridophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11565975\"]}");
	add("{\"term\":\"pteridosperm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625993\"]}");
	add("{\"term\":\"pteridospermae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625598\"]}");
	add("{\"term\":\"pteridospermaphyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625598\"]}");
	add("{\"term\":\"pteridospermopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625149\"]}");
	add("{\"term\":\"pteriidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01964377\"]}");
	add("{\"term\":\"pterion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05242430\"]}");
	add("{\"term\":\"pteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13234666\"]}");
	add("{\"term\":\"pternohyla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01654804\"]}");
	add("{\"term\":\"pterocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12585345\"]}");
	add("{\"term\":\"pterocarya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12342876\"]}");
	add("{\"term\":\"pterocles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01818496\"]}");
	add("{\"term\":\"pteroclididae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01818072\"]}");
	add("{\"term\":\"pterocnemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01524243\"]}");
	add("{\"term\":\"pterodactyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01726220\"]}");
	add("{\"term\":\"pterodactylidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01725900\"]}");
	add("{\"term\":\"pterodactylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01726066\"]}");
	add("{\"term\":\"pterois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02646078\"]}");
	add("{\"term\":\"pteropogon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12025798\"]}");
	add("{\"term\":\"pteropsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11685128\"]}");
	add("{\"term\":\"pteropus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02142566\"]}");
	add("{\"term\":\"pterosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01725639\"]}");
	add("{\"term\":\"pterosauria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01725469\"]}");
	add("{\"term\":\"pterospermum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12221264\"]}");
	add("{\"term\":\"pterostylis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12101523\"]}");
	add("{\"term\":\"pterygium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05325153\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }