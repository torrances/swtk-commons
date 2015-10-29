package org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aviary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02766609\"]}");
	add("{\"term\":\"aviation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00301267\", \"05643033\", \"08084054\", \"08450737\"]}");
	add("{\"term\":\"aviation medicine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06055568\"]}");
	add("{\"term\":\"aviator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09845606\"]}");
	add("{\"term\":\"aviatress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09846007\"]}");
	add("{\"term\":\"aviatrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09846007\"]}");
	add("{\"term\":\"avicenna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10849337\"]}");
	add("{\"term\":\"avicennia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12935990\"]}");
	add("{\"term\":\"avicennia marina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12936328\"]}");
	add("{\"term\":\"avicennia officinalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12936571\"]}");
	add("{\"term\":\"avicenniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12936160\"]}");
	add("{\"term\":\"avidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07570749\"]}");
	add("{\"term\":\"avidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07570749\"]}");
	add("{\"term\":\"avifauna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08010085\"]}");
	add("{\"term\":\"avignon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08954086\"]}");
	add("{\"term\":\"avionics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106838\"]}");
	add("{\"term\":\"avitaminosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14222058\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }