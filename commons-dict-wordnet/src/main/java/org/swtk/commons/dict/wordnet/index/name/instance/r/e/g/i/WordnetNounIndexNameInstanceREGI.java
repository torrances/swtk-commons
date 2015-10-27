package org.swtk.commons.dict.wordnet.index.name.instance.r.e.g.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREGI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"regicide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00225937\", \"10536015\"]}");
	add("{\"term\":\"regime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05918179\", \"08067430\"]}");
	add("{\"term\":\"regimen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05918179\"]}");
	add("{\"term\":\"regiment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08230738\"]}");
	add("{\"term\":\"regimentals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04078505\"]}");
	add("{\"term\":\"regimentation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01150778\"]}");
	add("{\"term\":\"regina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08848997\"]}");
	add("{\"term\":\"regiomontanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11215609\"]}");
	add("{\"term\":\"region\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06006992\", \"13781286\", \"08648560\", \"05229188\", \"08647614\"]}");
	add("{\"term\":\"regionalism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04885629\", \"06675595\", \"07171205\"]}");
	add("{\"term\":\"register\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02980897\", \"04078648\", \"04078824\", \"04078988\", \"13433494\", \"05134114\", \"06519032\"]}");
	add("{\"term\":\"registrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10536285\"]}");
	add("{\"term\":\"registrar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10536467\", \"10536625\", \"10536730\"]}");
	add("{\"term\":\"registration\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01001729\", \"04994605\", \"06491045\", \"08496997\", \"00050857\"]}");
	add("{\"term\":\"registry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06519032\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }