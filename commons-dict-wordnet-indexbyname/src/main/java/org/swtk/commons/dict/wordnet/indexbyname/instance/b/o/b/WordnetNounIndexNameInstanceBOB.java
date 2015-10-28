package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bob\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00337100\", \"02160718\", \"02863403\", \"02863579\", \"02864187\", \"05266592\", \"13708982\"]}");
	add("{\"term\":\"bobber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02863403\"]}");
	add("{\"term\":\"bobbin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02863755\"]}");
	add("{\"term\":\"bobble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00072684\"]}");
	add("{\"term\":\"bobby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09882027\"]}");
	add("{\"term\":\"bobbysock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716077\"]}");
	add("{\"term\":\"bobbysocks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716077\"]}");
	add("{\"term\":\"bobbysoxer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09882119\"]}");
	add("{\"term\":\"bobcat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02130134\"]}");
	add("{\"term\":\"bobfloat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02863403\"]}");
	add("{\"term\":\"bobolink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01576539\"]}");
	add("{\"term\":\"bobsled\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02864187\", \"02864362\"]}");
	add("{\"term\":\"bobsledding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00448448\"]}");
	add("{\"term\":\"bobsleigh\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02864187\", \"02864362\"]}");
	add("{\"term\":\"bobtail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02108293\", \"02160718\"]}");
	add("{\"term\":\"bobwhite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01807119\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }