package org.swtk.commons.dict.wiktionary.generated.p.e.g;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPEG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pego", "{\"term\":\"pego\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Origin uncertain.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The penis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pegacorn", "{\"term\":\"pegacorn\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|Pegasus|unicorn|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A horned Pegasus or a winged unicorn\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pegamoid", "{\"term\":\"pegamoid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"A former trademark.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A waterproof varnish used, applied to surfaces, in bookbinding and upholstery\", \"priority\":1}]}, \"synonyms\":{}}");

	add("peggy", "{\"term\":\"peggy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"also used as a formal given name\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1956\u0027\u0027, w:Grace Grace Metalious, \u0027Peyton Place\u0027 (UPNE, 1999, ISBN 1555534007), Book Two, Chapter 9\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027\u0027Peggy\u0027\u0027 Fitzgerald,\u0026quot; he had said, laughing in what he later remebered as his one and only attempt at humor with her. \u0026quot;\u0027\u0027Peggy\u0027\u0027 Fitzgerald,\u0026quot; he had said, in his easily remembered brogue. \u0026quot;Puts me in mind of me mither, an Irish lass from County Galway.\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Margaret Bunker Fitzgerald had not been amused. \u0026quot;You\u0027ll never get over it, will you?\u0026quot; she had spat at him furiously. \u0026quot;You\u0027ll never get over being an Irishman, a black Irish Catholic from a Boston slum. Don\u0027t you ever dare to call me \u0027\u0027Peggy\u0027\u0027 again. My name is Margaret, and don\u0027t you forget it!\u0026quot\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1996\u0027\u0027, w:Elizabeth Elizabeth McCracken, \u0027The Giant\u0027s House\u0027, page 257\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"When Caroline gave birth to another daughter, they named her Margaret Ann, after me and then Oscar\u0027s mother. They didn\u0027t realize that \u0027\u0027Peggy\u0027\u0027 was my given name. Now they call her Ann, because I do\", \"priority\":6}]}, \"synonyms\":{}}");

	add("pegging", "{\"term\":\"pegging\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The activity of artificial climbing on crags and in quarries outside the main mountain chapter\u003dChapter 9. Artificial climbing title\u003dMountaineering: From Hill Walking to Alpine page\u003d248|publisher\u003dPenguin passage\u003dThis chapter describes the extra equipment and special techniques needed for artificial climbing. As noted in § 34, 2, this form of climbing has been developed in this country on limestone crags and gritstone quarries outside the main mountain areas.}}\u0026lt;/ref\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The act of rectal penetration of a man by a woman wearing a strap-on dildo.\u0026lt;ref\u0026gt;The term was popularized when it became [http://www.thestranger.com/seattle/SavageLove?oid\u003d7730 the winning entry in a contest] in the \u0026quot;\u0026quot; sex advice column in 2001.\u0026lt;/ref\u0026gt\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }