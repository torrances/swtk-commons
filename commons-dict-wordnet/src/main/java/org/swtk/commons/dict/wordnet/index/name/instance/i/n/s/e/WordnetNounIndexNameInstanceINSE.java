package org.swtk.commons.dict.wordnet.index.name.instance.i.n.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINSE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"insect\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10811668\", \"02162607\"]}");
	add("{\"term\":\"insecta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02161923\"]}");
	add("{\"term\":\"insecticide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14944099\"]}");
	add("{\"term\":\"insectifuge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14944403\"]}");
	add("{\"term\":\"insectivora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01891161\"]}");
	add("{\"term\":\"insectivore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01327440\", \"01891715\"]}");
	add("{\"term\":\"insecureness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14567761\"]}");
	add("{\"term\":\"insecurity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07540157\", \"14565279\"]}");
	add("{\"term\":\"insemination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00846839\", \"00921506\"]}");
	add("{\"term\":\"insensibility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04851856\", \"05688823\"]}");
	add("{\"term\":\"insensitiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04851255\"]}");
	add("{\"term\":\"insensitivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04851255\"]}");
	add("{\"term\":\"insentience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05013933\"]}");
	add("{\"term\":\"insert\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00385137\", \"00385318\", \"03578433\", \"06408455\"]}");
	add("{\"term\":\"insertion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00321678\", \"06734935\"]}");
	add("{\"term\":\"insessores\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01526297\"]}");
	add("{\"term\":\"inset\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03476313\", \"03578433\", \"03578615\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }