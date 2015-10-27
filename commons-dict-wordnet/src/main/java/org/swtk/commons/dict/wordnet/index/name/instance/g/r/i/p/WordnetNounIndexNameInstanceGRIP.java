package org.swtk.commons.dict.wordnet.index.name.instance.g.r.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGRIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grip\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02863980\", \"05202142\", \"10167008\", \"11480680\", \"02776843\", \"03491080\", \"00814187\"]}");
	add("{\"term\":\"gripe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07224625\"]}");
	add("{\"term\":\"gripes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14349141\"]}");
	add("{\"term\":\"griping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14349141\"]}");
	add("{\"term\":\"grippe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14145979\"]}");
	add("{\"term\":\"gripsack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03465387\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }