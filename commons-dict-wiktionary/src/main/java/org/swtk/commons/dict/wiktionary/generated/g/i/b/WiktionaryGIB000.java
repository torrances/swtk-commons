package org.swtk.commons.dict.wiktionary.generated.g.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gibbs", "{\"term\":\"gibbs\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An English patronymic surname from Gibb (Gilbert\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gibberish", "{\"term\":\"gibberish\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Irish\"], \"text\":\"ca. 16th century. Either an onomatopeia, imitating to the sound of chatter, probably influenced by \u0027\u0027 or derived from the root of the Irish \u0027gob|lang\u003dga\u0027 () \u0026lt;ref\u0026gt;Mackay, Charles [http://books.google.com/books?id\u003dRCingf_1px0C\u0026amp;pg\u003dPA183\u0026amp;lpg\u003dPA183\u0026amp;dq\u003dgibberish+etymology\u0026amp;source\u003dweb\u0026amp;ots\u003dwoP9Nswjn6\u0026amp;sig\u003dzm3rR7oMcNw-yF3DDL5Q62t3EaA\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;resnum\u003d10\u0026amp;ct\u003dresul. PPA183,M1 A Glossary of Obscure Words and Phrases in the Writings of Shakespeare and His Contemporaries], pp. 183-184, S. Low, Marston, Searle, and Rivington, 1887\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Speech or writing that is unintelligible, incoherent or meaningless\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Hawthorn\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Such \u0027\u0027gibberish\u0027\u0027 as children may be heard amusing themselves with\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Needlessly obscure or overly technical language\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gibbet", "{\"term\":\"gibbet\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"frankish\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027gibet\u0027 (Modern French \u0027gibet\u0027 , either from Frankish {{m|frk|*gibb||forked stick}} or from Latin \u0027gibbus\u0027 (hunchbacked) \u0026lt;ref\u0026gt;\u0027Le Robert pour tous, Dictionnaire de la langue française\u0027, Janvier 2004, p. 520\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An upright post with a crosspiece used for execution and subsequent public display; a gallows\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The projecting arm of a crane, from which the load is suspended; the jib\", \"priority\":2}]}, \"synonyms\":{}}");

	add("gibbousness", "{\"term\":\"gibbousness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|gibbous|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being gibbous\", \"priority\":1}]}, \"synonyms\":{}}");

	add("giblets", "{\"term\":\"giblets\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"From Old french (842-ca. 1400) \u0027gibelet\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The internal organs of poultry birds, these organs being used as food\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gibson", "{\"term\":\"gibson\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Gibb|son|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A manufacturer of acoustic and electric guitars\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gibsons", "{\"term\":\"gibsons\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A coastal town in British Columbia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }