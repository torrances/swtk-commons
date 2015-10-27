package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cracidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01801727\"]}");
	add("{\"term\":\"crack\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00377802\", \"00788715\", \"03129835\", \"04700444\", \"06780568\", \"14509257\", \"07396023\", \"13930286\", \"03421239\", \"09281621\"]}");
	add("{\"term\":\"crackdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01150677\"]}");
	add("{\"term\":\"cracker\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03130003\", \"03349961\", \"09993808\", \"10533531\", \"07697671\"]}");
	add("{\"term\":\"crackerberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12969011\"]}");
	add("{\"term\":\"crackerjack\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03604405\", \"10242023\"]}");
	add("{\"term\":\"cracking\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13475034\", \"00377802\", \"07396023\"]}");
	add("{\"term\":\"crackle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03130239\", \"07396278\"]}");
	add("{\"term\":\"crackleware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03130239\"]}");
	add("{\"term\":\"crackling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07396278\", \"14701646\"]}");
	add("{\"term\":\"cracklings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687590\"]}");
	add("{\"term\":\"crackpot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09994026\"]}");
	add("{\"term\":\"cracksman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565619\"]}");
	add("{\"term\":\"cracow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09005783\"]}");
	add("{\"term\":\"cracticidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01585266\"]}");
	add("{\"term\":\"cracticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01585684\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }