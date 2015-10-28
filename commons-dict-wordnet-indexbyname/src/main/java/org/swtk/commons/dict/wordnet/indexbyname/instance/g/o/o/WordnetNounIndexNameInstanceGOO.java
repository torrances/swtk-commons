package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"goo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14980800\"]}");
	add("{\"term\":\"goober\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07753721\"]}");
	add("{\"term\":\"good\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03080712\", \"05149427\", \"04856472\", \"05167108\"]}");
	add("{\"term\":\"goodall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027177\"]}");
	add("{\"term\":\"goodby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"goodbye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"goodenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12188472\"]}");
	add("{\"term\":\"goodeniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12188266\"]}");
	add("{\"term\":\"goodman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027328\"]}");
	add("{\"term\":\"goodness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04856472\", \"05149427\"]}");
	add("{\"term\":\"goodwill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04647713\", \"07515169\", \"13353835\"]}");
	add("{\"term\":\"goody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572730\"]}");
	add("{\"term\":\"goodyear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027616\"]}");
	add("{\"term\":\"goodyera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12083915\"]}");
	add("{\"term\":\"goof\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09950334\", \"10177319\"]}");
	add("{\"term\":\"goofball\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09950334\", \"10177319\"]}");
	add("{\"term\":\"goofy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09622807\"]}");
	add("{\"term\":\"google\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06591081\"]}");
	add("{\"term\":\"googly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00478108\"]}");
	add("{\"term\":\"googol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13619651\"]}");
	add("{\"term\":\"googolplex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13619799\"]}");
	add("{\"term\":\"gook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14980800\"]}");
	add("{\"term\":\"goon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10203700\", \"10294336\"]}");
	add("{\"term\":\"gooney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02061401\"]}");
	add("{\"term\":\"goonie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02061401\"]}");
	add("{\"term\":\"goony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02061401\"]}");
	add("{\"term\":\"goop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04260861\", \"14980800\"]}");
	add("{\"term\":\"goosander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01857341\"]}");
	add("{\"term\":\"goose\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07662430\", \"10177319\", \"01858313\"]}");
	add("{\"term\":\"gooseberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07760406\", \"12826775\"]}");
	add("{\"term\":\"goosebump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00868284\"]}");
	add("{\"term\":\"goosefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02550878\"]}");
	add("{\"term\":\"gooseflesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00868284\"]}");
	add("{\"term\":\"goosefoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11848716\"]}");
	add("{\"term\":\"gooseneck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13891768\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }