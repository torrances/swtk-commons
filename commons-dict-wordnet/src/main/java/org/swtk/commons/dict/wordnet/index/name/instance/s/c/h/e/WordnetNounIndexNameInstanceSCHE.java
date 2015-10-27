package org.swtk.commons.dict.wordnet.index.name.instance.s.c.h.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCHE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"schedule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06507319\", \"05919534\"]}");
	add("{\"term\":\"scheduler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04152482\"]}");
	add("{\"term\":\"scheduling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01146868\"]}");
	add("{\"term\":\"scheele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11303833\"]}");
	add("{\"term\":\"scheelite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15045361\"]}");
	add("{\"term\":\"schefflera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11820828\"]}");
	add("{\"term\":\"scheldt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09448713\"]}");
	add("{\"term\":\"schema\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05900179\", \"05936599\"]}");
	add("{\"term\":\"schematic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04152643\"]}");
	add("{\"term\":\"schematisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00193306\", \"00901905\"]}");
	add("{\"term\":\"schematization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00193306\", \"00901905\"]}");
	add("{\"term\":\"scheme\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05900179\", \"05936599\", \"08452398\", \"06769391\", \"05913942\"]}");
	add("{\"term\":\"schemer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10575946\"]}");
	add("{\"term\":\"schemozzle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14000354\"]}");
	add("{\"term\":\"schenectady\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09148020\"]}");
	add("{\"term\":\"scheol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05637164\"]}");
	add("{\"term\":\"scherzo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07060975\"]}");
	add("{\"term\":\"scheuchzeriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12637901\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }