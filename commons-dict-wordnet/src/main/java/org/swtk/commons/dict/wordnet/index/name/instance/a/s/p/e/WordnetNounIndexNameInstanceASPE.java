package org.swtk.commons.dict.wordnet.index.name.instance.a.s.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aspect\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04687095\", \"13826881\", \"05941982\", \"04740358\", \"05859151\"]}");
	add("{\"term\":\"aspen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12754407\"]}");
	add("{\"term\":\"asper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13709525\"]}");
	add("{\"term\":\"aspergill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02751188\"]}");
	add("{\"term\":\"aspergillaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13047950\"]}");
	add("{\"term\":\"aspergillales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13047523\"]}");
	add("{\"term\":\"aspergillosis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14095041\", \"14206353\", \"14283851\"]}");
	add("{\"term\":\"aspergillus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13048135\"]}");
	add("{\"term\":\"asperity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04650456\", \"04717403\"]}");
	add("{\"term\":\"aspersion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01040293\", \"01222825\", \"06731387\"]}");
	add("{\"term\":\"aspersorium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02751188\", \"02751364\"]}");
	add("{\"term\":\"asperula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12682181\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }