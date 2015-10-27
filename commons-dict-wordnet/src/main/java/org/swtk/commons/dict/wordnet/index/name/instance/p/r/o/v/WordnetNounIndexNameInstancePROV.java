package org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePROV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"provability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04762721\"]}");
	add("{\"term\":\"provenance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08527477\"]}");
	add("{\"term\":\"provencal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06978970\"]}");
	add("{\"term\":\"provence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08964733\"]}");
	add("{\"term\":\"provender\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07587918\", \"07816067\"]}");
	add("{\"term\":\"provenience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08527477\"]}");
	add("{\"term\":\"proventil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02698180\"]}");
	add("{\"term\":\"provera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14771347\"]}");
	add("{\"term\":\"proverb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07168546\"]}");
	add("{\"term\":\"proverbs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06448978\"]}");
	add("{\"term\":\"providence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04900165\", \"14497501\", \"01134648\", \"09160159\"]}");
	add("{\"term\":\"provider\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10505934\", \"10696710\"]}");
	add("{\"term\":\"province\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14539235\", \"08671935\"]}");
	add("{\"term\":\"provincial\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10430413\", \"10478400\"]}");
	add("{\"term\":\"provincialism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06212164\", \"06215672\"]}");
	add("{\"term\":\"provirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14841311\"]}");
	add("{\"term\":\"provision\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13388621\", \"05802702\", \"01059124\", \"06768658\"]}");
	add("{\"term\":\"provisioner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10701004\"]}");
	add("{\"term\":\"provisions\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07587918\"]}");
	add("{\"term\":\"proviso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06768658\"]}");
	add("{\"term\":\"provitamin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15114946\"]}");
	add("{\"term\":\"provo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09170361\"]}");
	add("{\"term\":\"provocateur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09797833\"]}");
	add("{\"term\":\"provocation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07267432\", \"09207872\", \"01224279\"]}");
	add("{\"term\":\"provoker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10228847\"]}");
	add("{\"term\":\"provos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08041485\"]}");
	add("{\"term\":\"provost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10506053\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }