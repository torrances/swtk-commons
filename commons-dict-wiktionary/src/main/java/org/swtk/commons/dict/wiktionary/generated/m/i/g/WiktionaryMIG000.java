package org.swtk.commons.dict.wiktionary.generated.m.i.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMIG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mighty", "{\"term\":\"mighty\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"Swedish\"], \"text\":\"From Old english (ca. 450-1100) {{m|ang|sc\u003dLatinx|mihtiġ}}. Compare Swedish \u0027lang\u003dsv\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Influential, powerful beings\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.economist.com/news/united-states/21583274-new-wave-press-barons-should-not-allow-newspapers-become-niche-products-keeping Keeping the mighty passage\u003dBritish journalists shun complete respectability, feeling a duty to be ready to savage the \u0027\u0027mighty\u0027\u0027, or rummage through their bins. Elsewhere in Europe, government contracts and subsidies ensure that press barons will only defy the \u0027\u0027mighty\u0027\u0027 so far\", \"priority\":2}]}, \"synonyms\":{}}");

	add("migmatite", "{\"term\":\"migmatite\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Swedish\"], \"text\":\"From Swedish \u0027migmatit\u0027 from Ancient greek (to 1453) \u0027μίγμα\u0027 (mixture) + Swedish \u0027-it\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any rock of mixed appearance, being an intimate mixture of granite and older rock, specifically from intense metamorphism which partially melts the rock, causing it to recrystallize in a state intermediate between igneous and metamorphic\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, \u0027The Earth\u0027, Folio Society 2011, p. 163\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"More specifically, many of these rocks are described as \u0027\u0027migmatites\u0027\u0027, in which the pink veins seem to blend insensibly into a kind of swirling granite\", \"priority\":3}]}, \"synonyms\":{}}");

	add("mignonette", "{\"term\":\"mignonette\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"French\"], \"text\":\"French \u0027mignonette\u0027 from \u0027mignon\u0027 (dainty) + \u0027-ette\u0027 (lang\u003dfr)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant () having greenish flowers with orange-colored stamens, and exhaling a delicious fragrance. In Africa it is a low shrub, but further north it is usually an annual herb\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A grey-green colour, like that of the plant\", \"priority\":2}]}, \"synonyms\":{}}");

	add("migraine", "{\"term\":\"migraine\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"French\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\"], \"text\":\"1777 re-spelling (following French of late 14th century Middle english (1100-1500) \u0027megrim\u0027 from 13th century Old french (842-ca. 1400) \u0027migraigne\u0027 from pronunciation of \u0027hemicrania\u0027 (pain in one half of the head) from Ancient greek (to 1453) \u0027ἡμικρανία\u0027 () from \u0027ἡμι-\u0027 (hemi-, half) + \u0027κρανίον\u0027 (skull) (whence also \u0027\u0027 \u0026lt;ref\u0026gt;{{R:Online Etymology Dictionary}}\u0026lt;/ref\u0026gt;, from a literal translation of Egyptian \u0027gs-tp\u0027 \u0027headache\u0027\u0026lt;ref\u0026gt;Borghouts, \u0027[http://books.google.ca/books?id\u003dvgMVAAAAIAAJ\u0026amp;pg\u003dPA9\u0026amp;dq\u003d%22Still,+the+word+suggests+a+correspondence+with+our+%22\u0026amp;hl\u003den\u0026amp;ei\u003d6VGBTMD3NYyJnQfz5OVY\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;ct\u003dresult\u0026amp;resnum\u003d1\u0026amp;ved\u003d0CCsQ6AEwA. v\u003donepage\u0026amp;q\u003d%22Still%2C%20the%20word%20suggests%20a%20correspondence%20with%20our%20%22\u0026amp;f\u003dfalse The magical texts of Papyrus Leiden I 348]\u0027, 1971. p.9\u0026lt;/ref\u0026gt;.Cognate to \u0027\u0027 \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A severe, disabling headache, usually affecting only one side of the head, and often accompanied by nausea, vomiting, photophobia and visual disturbances\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"He had a headache so bad that he wished he was dead, but it was the sort of \u0027\u0027migraine\u0027\u0027 that promised him he would continue to suffer but not die\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"After consuming too much coffee every day for six weeks, she got severe \u0027\u0027migraines\u0027\u0027 that would last up until 47 minutes after her first cup of coffee\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }