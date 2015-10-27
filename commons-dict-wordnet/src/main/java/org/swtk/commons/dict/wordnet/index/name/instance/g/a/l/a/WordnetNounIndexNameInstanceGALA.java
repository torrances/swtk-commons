package org.swtk.commons.dict.wordnet.index.name.instance.g.a.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGALA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00519725\"]}");
	add("{\"term\":\"galactagogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14900830\"]}");
	add("{\"term\":\"galactocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14225327\"]}");
	add("{\"term\":\"galactose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14900922\"]}");
	add("{\"term\":\"galactosemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14179616\"]}");
	add("{\"term\":\"galactosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13507093\"]}");
	add("{\"term\":\"galago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02502439\"]}");
	add("{\"term\":\"galahad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11007172\"]}");
	add("{\"term\":\"galan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09308734\"]}");
	add("{\"term\":\"galangal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12171687\", \"12377477\"]}");
	add("{\"term\":\"galantine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07884806\"]}");
	add("{\"term\":\"galapagos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08795200\"]}");
	add("{\"term\":\"galatea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09578039\"]}");
	add("{\"term\":\"galatia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719110\"]}");
	add("{\"term\":\"galatian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09707992\"]}");
	add("{\"term\":\"galatians\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06455592\"]}");
	add("{\"term\":\"galax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12271795\"]}");
	add("{\"term\":\"galaxy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08287963\", \"12271795\", \"08287859\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }