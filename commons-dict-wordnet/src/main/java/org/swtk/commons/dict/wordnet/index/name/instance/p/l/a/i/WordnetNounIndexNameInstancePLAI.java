package org.swtk.commons.dict.wordnet.index.name.instance.p.l.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plaice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02661161\", \"07806911\"]}");
	add("{\"term\":\"plaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04402241\"]}");
	add("{\"term\":\"plain\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03630435\", \"09416498\"]}");
	add("{\"term\":\"plainchant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07048658\"]}");
	add("{\"term\":\"plainclothesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457357\"]}");
	add("{\"term\":\"plainness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04698999\", \"04704615\", \"04828846\", \"14510610\"]}");
	add("{\"term\":\"plainsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457465\"]}");
	add("{\"term\":\"plainsong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07048658\"]}");
	add("{\"term\":\"plaint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07226610\", \"07251419\"]}");
	add("{\"term\":\"plaintiff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457619\"]}");
	add("{\"term\":\"plaintiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07550818\"]}");
	add("{\"term\":\"plait\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03972239\", \"05266995\"]}");
	add("{\"term\":\"plaiter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457809\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }