package org.swtk.commons.dict.wordnet.index.name.instance.a.u.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUTH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"authentication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00155053\", \"06868085\"]}");
	add("{\"term\":\"authenticator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09821662\"]}");
	add("{\"term\":\"authenticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04790511\"]}");
	add("{\"term\":\"author\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10145714\", \"10813654\"]}");
	add("{\"term\":\"authoress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09843467\"]}");
	add("{\"term\":\"authorisation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01140991\", \"05184134\", \"05203850\", \"06568472\"]}");
	add("{\"term\":\"authoriser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09844498\"]}");
	add("{\"term\":\"authoritarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09843537\"]}");
	add("{\"term\":\"authoritarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08457622\"]}");
	add("{\"term\":\"authorities\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08067430\"]}");
	add("{\"term\":\"authority\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06423235\", \"05184134\", \"08354251\", \"05705328\", \"09843763\", \"09844011\", \"05203850\"]}");
	add("{\"term\":\"authorization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01140991\", \"05184134\", \"05203850\", \"06568472\"]}");
	add("{\"term\":\"authorizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09844498\"]}");
	add("{\"term\":\"authorship\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00241621\", \"00931533\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }