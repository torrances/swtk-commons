package org.swtk.commons.dict.wordnet.index.name.instance.l.e.p.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEPT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"leptarrhena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819879\"]}");
	add("{\"term\":\"leptinotarsa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02172485\"]}");
	add("{\"term\":\"leptocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02314400\"]}");
	add("{\"term\":\"leptodactylid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01645584\"]}");
	add("{\"term\":\"leptodactylidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01645312\"]}");
	add("{\"term\":\"leptodactylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01646328\"]}");
	add("{\"term\":\"leptoglossus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02242586\"]}");
	add("{\"term\":\"leptomeninges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05489980\"]}");
	add("{\"term\":\"leptomeningitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14372851\"]}");
	add("{\"term\":\"lepton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09360919\", \"13697454\"]}");
	add("{\"term\":\"leptopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12974945\"]}");
	add("{\"term\":\"leptoptilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02005529\"]}");
	add("{\"term\":\"leptospira\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01386143\"]}");
	add("{\"term\":\"leptospirosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14296867\"]}");
	add("{\"term\":\"leptosporangium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13113861\"]}");
	add("{\"term\":\"leptotene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13528539\"]}");
	add("{\"term\":\"leptotyphlopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01743034\"]}");
	add("{\"term\":\"leptotyphlops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01743362\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }